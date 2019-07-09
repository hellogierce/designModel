package com.wyc.abstract_factory_model;

public class Icar3wFactory implements IcarFactory {
    @Override
    public Icar createCar3w() {
        Icar car=new Car3w(100, "朗逸");
        return car;
    }
}
