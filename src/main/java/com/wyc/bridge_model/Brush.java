package com.wyc.bridge_model;

public abstract class Brush {
    Color c;

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    abstract void paint();
}
