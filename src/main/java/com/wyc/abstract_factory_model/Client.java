package com.wyc.abstract_factory_model;

public class Client {
    public static void main(String[] args) {
        IcarFactory factory=new Icar3wFactory();
        Icar car=factory.createCar3w();
        car.start();
        car.stop();
    }
}
