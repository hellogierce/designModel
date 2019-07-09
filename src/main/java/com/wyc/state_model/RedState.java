package com.wyc.state_model;

public  class RedState extends State {
    @Override
    void handlepush(Context c) {
        c.setState(new GreenState());
    }

    @Override
    void handlepull(Context c) {
        c.setState(new BlueState());
    }

     String getcolor(){
        return "red";
     }
}
