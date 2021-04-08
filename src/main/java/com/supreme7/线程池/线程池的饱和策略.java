package com.supreme7.线程池;

import javax.management.relation.RoleUnresolved;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/24 下午10:51
 * @Description:
 */
public class 线程池的饱和策略 {
    public static void main(String[] args) {
        LinkedBlockingDeque<Runnable> queue = new LinkedBlockingDeque<Runnable>(3);
        // 这里设置线程的 饱和策略
        // 1. 直接抛出异常
        RejectedExecutionHandler handler1 = new ThreadPoolExecutor.AbortPolicy();
        // 2. 只调动所在的线程运行任务
        RejectedExecutionHandler handler2 = new ThreadPoolExecutor.CallerRunsPolicy();
        // 3. 丢弃队列里最近的一个任务，并执行当前任务
        RejectedExecutionHandler handler3 = new ThreadPoolExecutor.DiscardOldestPolicy();
        // 4. 不处理，丢弃掉
        RejectedExecutionHandler handler4 = new ThreadPoolExecutor.DiscardPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,5,
                60, TimeUnit.SECONDS,queue,handler2);
        for (int i = 0; i < 9 ; i++) {
//            threadPoolExecutor.execute(new Thread(new ThreadPoolDemo(),"Thread".concat(i+"")));
//            System.out.println("线程池中活跃的线程数：" + threadPoolExecutor.getActiveCount());
//            if (queue.size()>0){
//                System.out.println("-----队列中阻塞的线程数-----"+queue.size());
//            }
        }
        threadPoolExecutor.shutdown();
    }
}
