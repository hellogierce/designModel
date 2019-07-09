package com.wyc.made_model;

/**
 * 这个对象就是生成器
 */
public class CarProducer {
    private CarBuilder builder;

    public CarProducer(CarBuilder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.buildBody();
        builder.buildEngine();
        builder.buildWheel("front left");
        builder.buildWheel("front right");
        builder.buildWheel("back left");
        builder.buildWheel("back right");
    }
}
