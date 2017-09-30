package com.newlandFramework.rpc.parallel;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/9/29.
 * @Author：
 */
public class NamedThreadFactory implements ThreadFactory {

    private static final AtomicInteger threadNumber = new AtomicInteger(1);
    private static final AtomicInteger mthreadNumber = new AtomicInteger(1);
    private final String prefix;
    private final boolean daemoThread;
    private final ThreadGroup threadGroup;

    public NamedThreadFactory(){
        this("rpcserver-threadpool-" + threadNumber.getAndIncrement(), false);
    }



    public NamedThreadFactory(String prefix) {
        this(prefix, false);
    }

    public NamedThreadFactory(String prefix,Boolean damoe){
        this.prefix = StringUtils.isEmpty(prefix) ? prefix + "-thread-":"";
        daemoThread = damoe;
        SecurityManager securityManager = System.getSecurityManager();
        threadGroup = (securityManager == null) ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
    }

    public ThreadGroup getThreadGroup() {
        return this.threadGroup;
    }


    @Override
    public Thread newThread(Runnable r) {
        String name = prefix + mthreadNumber.getAndIncrement();
        Thread thread = new Thread(threadGroup,r,name,0);
        thread.setDaemon(daemoThread);
        return thread;
    }
}
