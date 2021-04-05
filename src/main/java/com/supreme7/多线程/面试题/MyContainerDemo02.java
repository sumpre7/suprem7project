package com.supreme7.多线程.面试题;

import java.io.PipedReader;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/31 上午6:52
 * @Description: 生产者 和 消费者容器 方式二
 * 使用 Condition
 */
public class MyContainerDemo02<T> {
    final private LinkedList<T> linkedLists = new LinkedList<>();
    final private int MAX = 10;
    private int count = 0;

    private Lock lock = new ReentrantLock();
    private Condition producer = lock.newCondition();
    private Condition consumer = lock.newCondition();

    public  void put(T t){
        try {
            lock.lock();
            while (linkedLists.size() == MAX) {
                producer.await();
            }
            linkedLists.add(t);
            ++count;
            // 通知消费者线程进行消费
            consumer.signalAll();
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

    public  T get(){
        T t = null;
        try {
            lock.lock();
            while (linkedLists.size() == 0){
                consumer.await();
            }
            t = linkedLists.removeFirst();
            count --;
            producer.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

        return t;
    }
}
