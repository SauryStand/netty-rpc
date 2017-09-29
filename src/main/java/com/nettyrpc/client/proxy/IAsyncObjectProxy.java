package com.nettyrpc.client.proxy;


import com.nettyrpc.client.RPCFuture;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：
 */
public interface IAsyncObjectProxy {
    public RPCFuture call(String funcName, Object... args);

}
