package com.wyc.duty_model;

public class Tangshen extends Player {
    public Tangshen(Player successor) {
        this.setSuccessor(successor);
    }
    @Override
    public void handle(int i) {
        if (i==1){
            System.out.println("tangshen drink");
        }else{
            System.out.println("tangshen pass");
            next(i);
        }
    }
}
