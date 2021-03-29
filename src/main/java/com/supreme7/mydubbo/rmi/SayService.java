package com.supreme7.mydubbo.rmi;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/29 上午7:29
 * @Description:
 */
public class SayService implements ISayService {
    @Override
    public String say(String name){
        System.out.println(name + " say : hello");
        return name+ " say : hello";
    }
}
