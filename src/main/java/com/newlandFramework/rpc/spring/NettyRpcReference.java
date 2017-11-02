package com.newlandFramework.rpc.spring;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
/**
 * @Description:
 * @Created by Johnny Chou on 2017/10/9.
 * @Author：
 */
public class NettyRpcReference implements FactoryBean, InitializingBean, DisposableBean {
    private String interfaceName;
    private String ipAddr;
    private String protocol;
    private EventBus eventBus = new EventBus();

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void destroy() throws Exception {
        eventBus.post(new ClientStopEvent(0));
    }

    public void afterPropertiesSet() throws Exception {
        MessageSendExecutor.getInstance().setRpcServerLoader(ipAddr, RpcSerializeProtocol.valueOf(protocol));
        ClientStopEventListener listener = new ClientStopEventListener();
        eventBus.register(listener);
    }

    public Object getObject() throws Exception {
        return MessageSendExecutor.getInstance().execute(getObjectType());
    }

    public Class<?> getObjectType() {
        try {
            return this.getClass().getClassLoader().loadClass(interfaceName);
        } catch (ClassNotFoundException e) {
            System.err.println("spring analyze fail!");
        }
        return null;
    }

    public boolean isSingleton() {
        return true;
    }
}
