package com.wyc.made_model;

public class BenzBuilder implements CarBuilder {
    private Car car=new Benz();
    @Override
    public void buildBody() {
        car.addBody(new Body("商务车身"));
    }

    @Override
    public void buildEngine() {
        car.addEngine(new Engine("前置6缸"));
    }

    @Override
    public void buildWheel(String name) {
        car.addWheel(new Wheel(name));
    }
    public Benz getCar(){
        return (Benz) car;
    }
}
