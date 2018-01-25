package com.newlandFramework.rpc.netty;

import com.newlandFramework.rpc.serialize.RpcSerializeProtocol;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/11/13.
 * @Author：
 */
public class MessageRecvChannelInitializer {

    private RpcSerializeProtocol protocol;
    private RpcRecvSerializeFrame frame = null;

    MessageRecvChannelInitializer buildRpcSerializeProtocol(RpcSerializeProtocol protocol){
        this.protocol = protocol;
        return this;
    }
//    MessageRecvChannelInitializer(Map<String, Object> handlerMap) {
//        frame = new RpcRecvSerializeFrame(handlerMap);
//    }
//
//    protected void initChannel(SocketChannel socketChannel) throws Exception {
//        ChannelPipeline pipeline = socketChannel.pipeline();
//        frame.select(protocol, pipeline);
//    }

}
