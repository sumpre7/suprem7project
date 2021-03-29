package com.supreme7.jvm.oom;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/5 下午9:00
 * @Description: java 堆用于存储对象实例
 * VN options : -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add("1");
            System.out.println(i++);
        }
    }

    public static void test() {
        int i = 0;
        Date date = new Date();
        System.out.println(i);

    }

}
