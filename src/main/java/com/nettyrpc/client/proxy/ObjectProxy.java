package com.nettyrpc.client.proxy;

import com.nettyrpc.client.ConnectionManage;
import com.nettyrpc.client.RpcClientHandler;
import com.nettyrpc.client.RpcFuture;
import com.nettyrpc.protocol.RpcRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：
 */
public class ObjectProxy<T> implements InvocationHandler,IAsyncObjectProxy {

    private static final Logger logger = LoggerFactory.getLogger(ObjectProxy.class);
    private Class<T> tClass;
    public ObjectProxy(Class<T> tClass){
        this.tClass = tClass;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(Object.class == method.getDeclaringClass()){
            String name = method.getName();
            if("equals".equals(name)){
                return proxy = args[0];
            }else if("hashCode".equals(name)){
                return System.identityHashCode(proxy);
            }else if("toString".equals(name)){
                return proxy.getClass().getName() + "@"+Integer.toHexString(System.identityHashCode(proxy))+",with InvocationHandler"+this;
            }else{
                throw new IllegalStateException(String.valueOf(method));
            }

        }

        RpcRequest request = new RpcRequest();
        request.setRequestId(UUID.randomUUID().toString());
        request.setClassName(method.getDeclaringClass().getName());
        request.setMethodName(method.getName());
        request.setParameterType(method.getParameterTypes());
        request.setParameters(args);
        //debug
        logger.debug(method.getDeclaringClass().getName());




        return null;
    }

    @Override
    public RpcFuture rpcCall(String fullname, Object... args) {
        RpcClientHandler rpcClientHandler = ConnectionManage


        return null;
    }
}
