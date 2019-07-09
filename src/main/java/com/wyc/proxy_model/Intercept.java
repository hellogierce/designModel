package com.wyc.proxy_model;

public class Intercept {
    public void before(){
        System.out.println("intercept before method");
    }
    public void after(){
        System.out.println("intercept after method");
    }
}
