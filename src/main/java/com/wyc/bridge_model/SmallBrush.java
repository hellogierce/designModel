package com.wyc.bridge_model;

public class SmallBrush extends Brush {
    @Override
    void paint() {
        System.out.println("use small brush "+this.c.color);
    }
}
