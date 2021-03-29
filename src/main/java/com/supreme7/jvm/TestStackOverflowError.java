package com.supreme7.jvm;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/18 上午11:58
 * @Description:  函数调用栈太深，由于循环调用方法而无法退出
 *  在jvm运行时，数据区域中Java虚拟机栈在执行Java方法时会进行压栈弹栈的操作。
 *  在栈中会保存局部变量，操作数栈，方法出口等。
 *  jvm 规定了栈的最大深度，当执行时栈的深度大于规定的深度，就会抛出 StackOverflowError
 */
public class TestStackOverflowError {
    public void a(){
        b();
    };
    public void b(){
        a();
    };

    public static void main(String[] args) {
         new TestStackOverflowError().a();
    }
}
