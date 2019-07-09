package com.wyc.duty_model;

public class Shashen extends Player {
    public Shashen(Player successor) {
        this.setSuccessor(successor);
    }
    @Override
    public void handle(int i) {
        if (i==4){
            System.out.println("Shashen drink");
        }else{
            System.out.println("Shashen pass");
            next(i);
        }
    }
}
