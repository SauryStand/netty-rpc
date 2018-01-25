package com.newlandFramework.rpc.event;
import com.google.common.eventbus.Subscribe;
import com.newlandFramework.rpc.netty.MessageSendExecutor;
/**
 * @Description: T
 * @Created by Johnny Chou on 1/25/2018.
 * @Author：
 */
public class ClientStopEventListener {
    public int lastMessage = 0;
    @Subscribe
    public void listen(ClientStopEvent event) {
        lastMessage = event.getMessage();
        MessageSendExecutor.getInstance().stop();
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
