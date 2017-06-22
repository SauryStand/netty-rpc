package com.nettyrpc.client;

import com.nettyrpc.registry.ServiceDiscovery;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：luxiaoxun on 2016-03-09.
 */
public class RpcClient {
    private String serverAddress;
    private ServiceDiscovery serviceDiscovery;
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(16, 16, 600L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(65535));

    public RpcClient(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public static <T> T create(Class<T> interfaceClass){

    }


}
