package com.nettyrpc.client;

import com.nettyrpc.client.proxy.IAsyncObjectProxy;
import com.nettyrpc.client.proxy.ObjectProxy;
import com.nettyrpc.registry.ServiceDiscovery;

import java.lang.reflect.Proxy;
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
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(16, 16, 600L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(65536));

    public RpcClient(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public RpcClient(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    @SuppressWarnings("unchecked")
    public static <T> T create(Class<T> interfaceClass) {
        return (T) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class<?>[]{interfaceClass},
                new ObjectProxy<T>(interfaceClass)
        );
    }

    public static <T> IAsyncObjectProxy createAsync(Class<T> interfaceClass) {
        return new ObjectProxy<T>(interfaceClass);
    }

    public static void submit(Runnable task){
        threadPoolExecutor.submit(task);
    }

    public void stop() {
        threadPoolExecutor.shutdown();
        serviceDiscovery.stop();
        ConnectionManage.getInstance().stop();
    }


}
