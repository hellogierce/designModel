package com.wyc.duty_model;

public class Sunwukong extends Player {
    public Sunwukong(Player successor) {
        this.setSuccessor(successor);
    }
    @Override
    public void handle(int i) {
        if (i==2){
            System.out.println("Sunwukong drink");
        }else{
            System.out.println("Sunwukong pass");
            next(i);
        }
    }
}
