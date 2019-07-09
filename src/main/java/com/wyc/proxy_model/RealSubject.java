package com.wyc.proxy_model;

public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("realsubject deal this request!");
    }
}
