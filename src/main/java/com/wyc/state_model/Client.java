package com.wyc.state_model;

public class Client {
    public static void main(String[] args) {
        State state=new GreenState();
        Context c=new Context(state);
        int i=0;
        while(i<100){
            c.pull();
            i++;
        }
    }
}
