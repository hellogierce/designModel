package com.wyc.proxy_model;

/**
 * 静态代理
 */
public class StaticInvocation {
    public Object invokeDoSomething(){
        TargetImpl t=new TargetImpl();
        Intercept p=new Intercept();
        p.before();
        t.doSomething();
        p.after();
        return null;
    }

    public static void main(String[] args) {
        StaticInvocation staticInvocation=new StaticInvocation();
        staticInvocation.invokeDoSomething();
    }
}
