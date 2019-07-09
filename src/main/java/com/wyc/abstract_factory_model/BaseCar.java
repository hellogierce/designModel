package com.wyc.abstract_factory_model;

public class BaseCar implements Icar {
    int speed;
    String name;

    public BaseCar(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
