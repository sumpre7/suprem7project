package com.supreme7.mydubbo.rmi;

import java.rmi.Remote;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/29 上午7:31
 * @Description:
 */
public interface ISayService extends Remote {
    String say(String name) throws Exception;
}
