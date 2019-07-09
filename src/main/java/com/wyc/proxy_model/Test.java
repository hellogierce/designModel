package com.wyc.proxy_model;

import java.lang.reflect.Proxy;

public class Test {
    public static void logic1(){
        DynamicInvocation iv=new DynamicInvocation();
        Object proxy= Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Target2.class,Target1.class},iv);
        publicLogic(proxy);
    }
    public static void logic2(){
        DynamicInvocation iv=new DynamicInvocation();
        Object proxy= Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Target2.class},iv);
        publicLogic(proxy);
    }

    private static void publicLogic(Object proxy){
        try {
            Target1 t1=(Target1)proxy;
            t1.doSomething();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            Target2 t2=(Target2)proxy;
            t2.do1("hello");
            t2.do2();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Test.logic1();
        Test.logic2();
    }
}
