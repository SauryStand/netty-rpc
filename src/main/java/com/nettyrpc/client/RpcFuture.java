package com.nettyrpc.client;

import com.nettyrpc.protocol.RpcRequest;
import com.nettyrpc.protocol.RpcResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：
 */
public class RpcFuture implements Future<Object> {

    private static final Logger logger = LoggerFactory.getLogger(RpcFuture.class);

    private Sync sync;
    private RpcRequest request;
    private RpcResponse response;
    private long startTime;
    private long responseTimeThreadshold = 5000;
    private List<AsyncRpcCallback> pendingCallbacks = new ArrayList<AsyncRpcCallback>();
    private ReentrantLock lock = new ReentrantLock();

    public RpcFuture(RpcRequest request){
        this.sync = new Sync();
        this.request = request;
        this.startTime = System.currentTimeMillis();
    }




    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return sync.isDone();
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        sync.acquire(-1);

        return null;
    }

    @Override
    public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
