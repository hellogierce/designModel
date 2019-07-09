package com.wyc.bridge_model;

public class MiddleBrush extends Brush {
    @Override
    void paint() {
        System.out.println("use middle brush "+this.c.color);
    }
}
