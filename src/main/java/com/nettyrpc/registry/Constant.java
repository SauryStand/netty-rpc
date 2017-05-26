package com.nettyrpc.registry;

/**
 * ZooKeeper constant
 * Created by Administrator on 2017/5/26.
 * @author huangyong
 */
public interface Constant {
    int ZK_SESSION_TIMEOUT = 5000;
    String ZK_REGISTRY_PATH = "/registry";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
