package com.wyc.proxy_model;

public class ProxySubject extends Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        preRequest();
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        realSubject.request();
    }
    private void preRequest(){
        System.out.println("代理对象对请求进行预处理!");
    }

    public static void main(String[] args) {
        Subject subject=new RealSubject();
        subject.request();
        Subject subject2=new ProxySubject();
        subject2.request();
    }
}
