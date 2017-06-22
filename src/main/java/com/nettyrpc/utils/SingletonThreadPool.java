package com.nettyrpc.utils;

import org.apache.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 线程池单例对象
 * @Created by Johnny Chou on 2017/6/19.
 * @Author：
 */
public class SingletonThreadPool {

    private static Logger logger = Logger.getLogger("SingletonThreadPool");
    //initial pool size
    private static final int THREAD_SIZE = Runtime.getRuntime().availableProcessors();

    private static ExecutorService service = null;

    private SingletonThreadPool(){
    };

    /**
     * 获取线程池对象
     * 如果是CPU密集型应用，则线程池大小设置为N+1
     * 如果是IO密集型应用，则线程池大小设置为2N+1
     * @return
     */
    public static synchronized  ExecutorService getExecutorService(){
        if(service == null){
            int threadCount = (THREAD_SIZE * 2) + 1;
            service = Executors.newFixedThreadPool(threadCount);
            logger.debug("获取线程池对象, 对象地址: " + service + ", 线程池大小: " + threadCount);
        }
        return service;
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ExecutorService executorService = SingletonThreadPool.getExecutorService();
                    System.out.println("executorService ----> " + executorService);
                    executorService.submit(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("excute once....");
                        }
                    });
                }
            }).start();
        }
    }


}
