package com.wyc.abstract_factory_model;

public class Car3w extends BaseCar {

    public Car3w(int speed, String name) {
        super(speed, name);
    }
    public void start(){
        System.out.println(this.getName()+"--启动--"+this.getSpeed());
    }
    public void stop(){
        System.out.println(this.getName()+"--停车");
    }
}
