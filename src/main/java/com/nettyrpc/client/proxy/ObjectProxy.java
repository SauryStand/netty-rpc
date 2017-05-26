package com.nettyrpc.client.proxy;

import com.nettyrpc.client.ConnectionManage;
import com.nettyrpc.client.RpcClientHandler;
import com.nettyrpc.client.RpcFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
        return null;
    }

    @Override
    public RpcFuture rpcCall(String fullname, Object... args) {
        RpcClientHandler rpcClientHandler = ConnectionManage


        return null;
    }
}
