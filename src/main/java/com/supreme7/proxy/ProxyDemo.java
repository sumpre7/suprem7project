package com.supreme7.proxy;

import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.Method;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/18 下午11:35
 * @Description:
 */
public class ProxyDemo {
    public static void main(String[] args) {
    }

    public Test createProxyInstance(TnvokeHandlerEx handler,Class<?> clazz){
        return new Test() {
            @Override
            public void say() {
                try {
                    Method sayMethod = clazz.getMethod("say");
                    handler.invode(this,sayMethod);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        };
    }

}

interface Test{
    public void say();
}
interface TnvokeHandlerEx {
    Object invode(Object obj, Method method, Object... arg);
}
