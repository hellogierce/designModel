package com.wyc.strategy_model;
//因为木头鸭子不会发声,所以不必实现quackable 接口
public class WoodDuck extends Duck  {
    @Override
    void swim() {
        System.out.println("我是木头鸭子,我会游泳!");
    }

}
