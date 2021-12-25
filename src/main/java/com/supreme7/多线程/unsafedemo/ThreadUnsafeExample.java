package com.supreme7.多线程.unsafedemo;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/8/22 9:16 上午
 * @Description:
 */
public class ThreadUnsafeExample {
    private volatile int cnt = 0;
    public synchronized void setCnt(){
        cnt++;
    }
    public int getCnt() {
        return cnt;
    }
}
