package com.supreme7.多线程;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/25 上午7:40
 * @Description:  main线程和多个线程同时运行
 */
public class 查看main方法的线程情况 {
    public static void main(String[] args) {
        // 获取Java线程管理的MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo info: threadInfos) {
            System.out.println("[" + info.getThreadId() + "]" + info.getThreadName());
        }

    }
}
