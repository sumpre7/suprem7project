package com.supreme7.设计模式.singleton;

import org.apache.activemq.util.StopWatch;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:20
 * @Description:
 */
class LazySingletonTest {

    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String s = (Math.random()+"").substring(2,8);
        }
        long e1 = System.currentTimeMillis();
        System.out.println(e1-s1);

        long s11 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            String s = String.valueOf((Math.random()+"").substring(2,8));
        }
        long e11 = System.currentTimeMillis();
        System.out.println(e11-s11);

        long s2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String se = String.valueOf((int)(Math.random()*9+1)*Math.pow(10,5));
        }
        long e2 = System.currentTimeMillis();
        System.out.println(e2-s2);

        Thread thread1 = new Thread(new LazySingletonExectorThread());
        Thread thread2 = new Thread(new LazySingletonExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("Thread end");
    }



}