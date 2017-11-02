package com.newlandFramework.rpc.netty;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.newlandFramework.rpc.core.RpcSystemConfig;
import com.newlandFramework.rpc.parallel.RpcThreadPool;
import com.newlandFramework.rpc.serialize.RpcSerializeProtocol;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/10/27.
 * @Author：
 */
public class RpcServerLoader {

    private static volatile RpcServerLoader rpcServerLoader;
    private static final String DELIMITER = RpcSystemConfig.DELIMITER;
    private RpcSerializeProtocol serializeProtocol = RpcSerializeProtocol.JDKSERIALIZE;
    private static final int parallel = RpcSystemConfig.PARALLEL * 2;
    private EventLoopGroup eventLoopGroup = new NioEventLoopGroup(parallel);
    private static int threadNums = RpcSystemConfig.SYSTEM_PROPERTY_THREADPOOL_THREAD_NUMS;
    private static int queueNums = RpcSystemConfig.SYSTEM_PROPERTY_THREADPOOL_QUEUE_NUMS;
    private static ListeningExecutorService threadPoolExecutor = MoreExecutors.listeningDecorator((ThreadPoolExecutor) RpcThreadPool.getExecutor(threadNums, queueNums));
    private MessageSendHandler messageSendHandler = null;
    private Lock lock = new ReentrantLock();
    private Condition connectStatus = lock.newCondition();
    private Condition handlerStatus = lock.newCondition();



    public static RpcServerLoader getInstance() {
        if (rpcServerLoader == null) {
            synchronized (RpcServerLoader.class) {
                if (rpcServerLoader == null) {
                    rpcServerLoader = new RpcServerLoader();
                }
            }
        }
        return rpcServerLoader;
    }



    public void setSerializeProtocol(RpcSerializeProtocol serializeProtocol) {
        this.serializeProtocol = serializeProtocol;
    }

}
