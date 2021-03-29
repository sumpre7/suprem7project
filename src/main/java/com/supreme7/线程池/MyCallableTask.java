package com.supreme7.线程池;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/25 下午7:14
 * @Description:
 */
public class MyCallableTask implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("callable do something");
        Thread.sleep(5000);
        return new Random().nextInt(100);
    }
}
