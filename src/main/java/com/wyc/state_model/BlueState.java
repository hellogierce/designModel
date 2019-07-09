package com.wyc.state_model;

public  class BlueState extends State {
    @Override
    void handlepush(Context c) {
        c.setState(new RedState());
    }

    @Override
    void handlepull(Context c) {
        c.setState(new GreenState());
    }

     String getcolor(){
        return "blue";
     }
}
