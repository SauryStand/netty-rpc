package com.nettyrpc.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.List;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/5/26.
 * @Author：
 */
public class ConnectionManage {

    private static final Logger logger = LoggerFactory.getLogger(ConnectionManage.class);

    private volatile static ConnectionManage connectionManage;
    public ConnectionManage(){}
    public static ConnectionManage getInstance(){
        if(connectionManage == null){
            synchronized (ConnectionManage.class){
                if(connectionManage == null){
                    connectionManage = new ConnectionManage();
                }
            }
        }
        return connectionManage;
    }

    /**
     * 更新连接已连接的服务
     * @param allServerAddress
     */
    public void updateConnectedServer(List<String> allServerAddress){
        if(allServerAddress != null){
            if(allServerAddress.size() > 0){
                //get available server node
                //update local serverNode cache
                HashSet<InetSocketAddress> newAllServerNodeSet = new HashSet<InetSocketAddress>();
                for(int i=0;i<allServerAddress.size();++i){
                    String[] array = allServerAddress.get(i).split(":");
                    if(array.length == 2) {
                        //and then you should chech IP and port
                        String host = array[0];
                        int port = Integer.parseInt(array[1]);

                    }
                }


            }
        }
    }



}
