package com.other.learning;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Created by Johnny Chou on 1/12/2018.
 * @Author：
 */
public class BoundedBeffer {
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[100];
    int putptr,takeptr,count;

    public void put(Object O) throws InterruptedException{
        lock.lock();
        try{
            while(count == items.length){

            }
        }finally {

        }
    }

}
