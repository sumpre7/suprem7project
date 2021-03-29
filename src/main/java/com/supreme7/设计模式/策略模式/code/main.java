package com.supreme7.设计模式.策略模式.code;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/14 下午3:40
 * @Description:
 */
public class main {
    public static void main(String[] args) {
        Person person = new Person(new Drive());
        person.goTrave();
    }
}
