package com.newlandFramework.rpc.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Created by Johnny Chou on 2017/9/30.
 * @Author：
 */
public class RpcServerStarter {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:rpc-invoke-config-server.xml");
    }



}
