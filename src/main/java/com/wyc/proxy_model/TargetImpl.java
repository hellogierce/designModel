package com.wyc.proxy_model;

public class TargetImpl implements Target1,Target2 {
    @Override
    public void doSomething() {
        System.out.println("target1 想要做事情");
    }

    @Override
    public String do1(String msg) {
        System.out.println("target2 do1 ing");
        return "target2 do1 method";
    }

    @Override
    public int do2() {
        System.out.println("target2 do2 ing");
        return 1000;
    }
}
