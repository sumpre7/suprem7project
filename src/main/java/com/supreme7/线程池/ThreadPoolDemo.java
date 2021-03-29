package com.supreme7.线程池;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/24 下午10:34
 * @Description:
 */
public class ThreadPoolDemo implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
