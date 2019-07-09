package com.wyc.strategy_model;

public class RealDuck extends Duck implements Quackable {
    @Override
    void swim() {
        System.out.println("我是真鸭子,我会游泳!");
    }

    @Override
    public void quack() {
        System.out.println("我是真鸭子,我会呼喊!");
    }
}
