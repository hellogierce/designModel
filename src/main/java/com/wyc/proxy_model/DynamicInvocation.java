package com.wyc.proxy_model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理:反射
 * 真正的处理业务逻辑
 * 主要使用俩个java.lang.reflect 中的2个类
 * 业务处理处implements invocationhandler
 * 客户端调用处,生成代理对象 proxy.newproxyinstance
 *
 */
public class DynamicInvocation implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        TargetImpl t=new TargetImpl();
        Intercept p=new Intercept();
        if (args!=null&&args.length==1){
            args[0]="param value has changed";
        }
        p.before();
        Object o=method.invoke(t, args);
        p.after();
        return o;
    }
}
