package com.wyc.state_model;

public abstract class State {
    abstract void handlepush(Context c);
    abstract void handlepull(Context c);
    abstract String getcolor();
}
