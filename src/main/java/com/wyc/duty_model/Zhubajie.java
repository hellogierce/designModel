package com.wyc.duty_model;

public class Zhubajie extends Player {
    public Zhubajie(Player successor) {
        this.setSuccessor(successor);
    }
    @Override
    public void handle(int i) {
        if (i==3){
            System.out.println("Zhubajie drink");
        }else{
            System.out.println("Zhubajie pass");
            next(i);
        }
    }
}
