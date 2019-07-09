package com.wyc.token_model.whitebox;

/**
 * 备忘
 */
public class Memento {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
