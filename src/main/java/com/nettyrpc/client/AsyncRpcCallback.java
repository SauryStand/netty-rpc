package com.nettyrpc.client;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：
 */
public interface AsyncRpcCallback {
    void success(Object result);
    void fail(Exception e);


}
