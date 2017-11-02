package com.newlandFramework.rpc.netty;

import com.newlandFramework.rpc.core.MessageCallBack;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/11/2.
 * @Author：
 */
public class MessageSendHandler extends ChannelInboundHandlerAdapter {

    private ConcurrentHashMap<String, MessageCallBack> mapCallBack = new ConcurrentHashMap<String, MessageCallBack>();


}
