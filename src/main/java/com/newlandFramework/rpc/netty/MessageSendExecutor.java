package com.newlandFramework.rpc.netty;

import com.newlandFramework.rpc.serialize.RpcSerializeProtocol;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/10/13.
 * @Author：
 */
public class MessageSendExecutor {
    private static class MessageSendExecutorHolder{
        private static final MessageSendExecutor instance = new MessageSendExecutor();
    }

    private static MessageSendExecutor getInstance(){
        return MessageSendExecutorHolder.instance;
    }

    private RpcServerLoader loader = RpcServerLoader.getInstance();

    public MessageSendExecutor() {
        //empty constructor
    }

    public MessageSendExecutor(String serverAddress, RpcSerializeProtocol rpcSerializeProtocol){
        loader.load(serverAddress,rpcSerializeProtocol);
    }

}
