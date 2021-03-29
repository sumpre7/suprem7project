package com.supreme7.jvm;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/6 下午5:19
 * @Description: 虚拟机栈 中  操作数栈
 */
public class OperandStackTest {

    public void testAddOpreation() {
        // byte 、 short 、 char 、 boolean : 都以int 型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;
    }
}
