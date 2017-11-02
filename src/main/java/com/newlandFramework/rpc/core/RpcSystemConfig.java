package com.newlandFramework.rpc.core;

/**
 * @Description: 常量定义类
 * @Created by Johnny Chou on 2017/11/2.
 * @Author：
 */
public class RpcSystemConfig {

    public static final String SYSTEM_PROPERTY_THREADPOOL_REJECTED_POLICY_ATTR = "com.newlandframework.rpc.parallel.rejected.policy";
    public static final String SYSTEM_PROPERTY_THREADPOOL_QUEUE_NAME_ATTR = "com.newlandframework.rpc.parallel.queue";
    public static final long SYSTEM_PROPERTY_MESSAGE_CALLBACK_TIMEOUT = Long.getLong("nettyrpc-default-msg-timeout", 10 * 1000L);
    public static final long SYSTEM_PROPERTY_ASYNC_MESSAGE_CALLBACK_TIMEOUT = Long.getLong("nettyrpc-default-asyncmsg-timeout", 60 * 1000L);
    public static final int SYSTEM_PROPERTY_THREADPOOL_THREAD_NUMS = Integer.getInteger("nettyrpc-default-thread-nums", 16);
    public static final int SYSTEM_PROPERTY_THREADPOOL_QUEUE_NUMS = Integer.getInteger("nettyrpc-default-queue-nums", -1);
    public static final int SYSTEM_PROPERTY_CLIENT_RECONNECT_DELAY = Integer.parseInt(System.getProperty("nettyrpc-default-client-reconnect-delay", "10"));
    public static final int PARALLEL = Math.max(2, Runtime.getRuntime().availableProcessors());
    public static final String DELIMITER = ":";
    public static final String RPC_COMPILER_SPI_ATTR = "com.newlandframework.rpc.compiler.AccessAdaptive";
    public static final String RPC_ABILITY_DETAIL_SPI_ATTR = "com.newlandframework.rpc.core.AbilityDetail";
    public static final String FILTER_RESPONSE_MSG = "Illegal request,NettyRPC server refused to respond!";

    private static boolean monitorServerSupport = false;

    public static boolean isMonitorServerSupport() {
        return monitorServerSupport;
    }

    public static void setMonitorServerSupport(boolean jmxSupport) {
        monitorServerSupport = jmxSupport;
    }
}
