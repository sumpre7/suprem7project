package com.supreme7.线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/25 下午7:15
 * @Description:
 */
public class CallableTest {
    public static void main(String[] args) {
        Callable<Integer> callable = new MyCallableTask();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
    }
}
