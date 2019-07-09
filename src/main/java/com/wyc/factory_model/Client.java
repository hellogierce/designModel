package com.wyc.factory_model;

public class Client {
    public static void main(String[] args) {
        AppleFactory factory=new AppleFactory();
        Apple apple=(Apple) factory.createFruit();
        apple.doSomething();
    }
}
