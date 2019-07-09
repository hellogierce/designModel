package com.wyc.bridge_model;

public class BigBrush extends Brush {
    @Override
    void paint() {
        System.out.println("use big brush "+this.c.color);
    }
}
