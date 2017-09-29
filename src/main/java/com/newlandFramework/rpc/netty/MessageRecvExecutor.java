package com.newlandFramework.rpc.netty;

import com.newlandFramework.rpc.parallel.NamedThreadFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.concurrent.ThreadFactory;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/9/29.
 * @Author：
 */
public class MessageRecvExecutor implements ApplicationContextAware {

    private String serverAddress;
    private int echoApiPort;

    ThreadFactory threadRpcFactory = new NamedThreadFactory("NettyRPC ThreadFactory");

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
