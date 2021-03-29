package com.supreme7.多线程.volatiledemo;

import java.util.concurrent.TimeUnit;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/27 下午5:24
 * @Description:
 */
public class testvolatile {
    private volatile boolean running = true;
    void m(){
        System.out.println("m is start");
        while (running){

        }
        System.out.println("m is end");
    }

    public static void main(String[] args) {
        testvolatile testvolatile = new testvolatile();
        new Thread(testvolatile::m).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        testvolatile.running = false;
    }
}
