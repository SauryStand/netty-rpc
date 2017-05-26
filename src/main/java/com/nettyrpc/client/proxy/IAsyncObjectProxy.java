package com.nettyrpc.client.proxy;

import com.nettyrpc.client.RpcFuture;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：
 */
public interface IAsyncObjectProxy {
    public RpcFuture rpcCall(String fullname,Object...args);

}
