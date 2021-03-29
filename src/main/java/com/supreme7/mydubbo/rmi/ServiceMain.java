package com.supreme7.mydubbo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/29 上午7:32
 * @Description:
 */
public class ServiceMain {
    public static void main(String[] args) throws Exception {
        // 实例化，要暴露给远程的方法/接口
        ISayService sayService = new SayService();
        // 开启本地服务
        ISayService iSayService = (ISayService) UnicastRemoteObject.exportObject(sayService, 999);
        // 服务注册中心
        final Registry registry = LocateRegistry.createRegistry(1000);
        // 注册服务
        registry.rebind("sayService",iSayService);

    }
}
