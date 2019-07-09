package com.wyc.strategy_model;

public class Client {
    public static void main(String[] args) {
        Duck duck1=new RealDuck();
        ((RealDuck) duck1).quack();
        duck1.swim();
        duck1.display();
        Duck duck2=new WoodDuck();
        duck2.swim();
        duck2.display();
    }
}
