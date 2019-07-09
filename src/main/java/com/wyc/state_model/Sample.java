package com.wyc.state_model;

public class Sample {
    String color;

    public Sample(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void operate(){
        System.out.println("显示颜色:"+this.color);
    }
}
