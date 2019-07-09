package com.wyc.observer_model;

import java.util.Observable;

/**
 * 被观察对象
 */
public class Earth extends Observable {
    private String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        setChanged();
        notifyObservers(weather);
    }
}
