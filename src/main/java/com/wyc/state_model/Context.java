package com.wyc.state_model;

public class Context {
    State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void push(){
        state.handlepush(this);
        Sample sample=new Sample(state.getcolor());
        sample.operate();
    }
    public void pull(){
        state.handlepull(this);
        Sample sample=new Sample(state.getcolor());
        sample.operate();
    }
}
