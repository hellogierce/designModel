package com.wyc.duty_model;

public abstract class Player {
    Player successor;//下一个处理人
    public Player(){
        successor=null;
    }

    public void setSuccessor(Player successor){
        this.successor=successor;
    }
    public void next(int index){
        if (successor!=null){
            successor.handle(index);
        }else{
            System.out.println("game over");
        }
    }
    public abstract void handle(int i);
}
