package com.wyc.factory_model;

public class AppleFactory implements AbstractFactory{
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
