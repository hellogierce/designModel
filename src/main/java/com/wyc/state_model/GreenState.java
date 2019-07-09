package com.wyc.state_model;

public  class GreenState extends State {
    @Override
    void handlepush(Context c) {
        c.setState(new BlueState());
    }

    @Override
    void handlepull(Context c) {
        c.setState(new RedState());
    }

     String getcolor(){
        return "green";
     }
}
