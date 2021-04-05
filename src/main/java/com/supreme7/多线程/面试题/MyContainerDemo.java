package com.supreme7.多线程.面试题;

import java.util.LinkedList;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/31 上午6:52
 * @Description: 生产者 和 消费者容器
 */
public class MyContainerDemo<T> {
    final private LinkedList<T> linkedLists = new LinkedList<>();
    final private int MAX = 10;
    private int count = 0;

    public synchronized void put(T t){
        while (linkedLists.size() == MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        linkedLists.add(t);
        ++count;
        // 通知消费者线程进行消费
        this.notifyAll();
    }

    public synchronized T get(){
        T t = null;
        while (linkedLists.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t = linkedLists.removeFirst();
        count --;
        this.notifyAll();
        return t;
    }
}
