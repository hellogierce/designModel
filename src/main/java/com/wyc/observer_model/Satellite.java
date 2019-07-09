package com.wyc.observer_model;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Satellite implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Earth earth=(Earth)o;
        System.out.println("未来24小时天气情况"+earth.getWeather());
        System.out.println("当前天气状况"+(String) arg);
    }

    public static void main(String[] args) {
        Earth earth=new Earth();
        Satellite satellite=new Satellite();
        //被观察者添加观察者
        earth.addObserver(satellite);
        //被观察者发生变化
        earth.setWeather(null);
        earth.setWeather("小雨");
        earth.setWeather("大雪");
    }
}
