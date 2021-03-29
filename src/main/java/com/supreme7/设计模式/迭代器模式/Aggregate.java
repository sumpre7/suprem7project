package com.supreme7.设计模式.迭代器模式;

import java.util.Iterator;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/4 9:48 下午
 * @Description:  聚合类
 */
public interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();

}
