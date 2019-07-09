package com.wyc.made_model;

public class Client {
    public static void main(String[] args) {
        BenzBuilder builder=new BenzBuilder();
        CarProducer producer=new CarProducer(builder);
        producer.construct();
        Benz car=builder.getCar();
        car.showMe();
    }
}
