package com.supreme7.mydubbo.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/29 上午7:50
 * @Description:
 */
public class CustomerMain {
    public static void main(String[] args) throws Exception {
        // 实例化注册中心
        final Registry registry = LocateRegistry.getRegistry(1000);
        // 发现服务
        ISayService sayService = (ISayService) registry.lookup("sayService");
        // 调用服务
        String customer = sayService.say("消费者");
        System.out.println("输出：" + customer);

    }
}
