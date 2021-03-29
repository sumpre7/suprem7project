package com.supreme7.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/22 上午7:18
 * @Description:
 */
public class 只读集合 {
    public static void main(String[] args) {
        String[] strings = new String[]{""};
        ArrayList<Object> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("只读");
        Collection<String> collection = Collections.unmodifiableCollection(linkedList);
        collection.add("添加修改");
    }
}
