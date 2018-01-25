package com.newlandFramework.rpc.event;

/**
 * @Description: 单例singletone
 * @Created by Johnny Chou on 1/25/2018.
 * @Author：
 */
public class ClientStopEvent {
    private final int message;
    public ClientStopEvent(int message){
        this.message = message;
    }
    public int getMessage(){
        return message;
    }
}
