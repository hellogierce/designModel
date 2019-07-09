package com.wyc.command_model;

public class Client {
    public static void main(String[] args) {
        Player player=new Player();
        BossCommand coach=new Coach(player);
        coach.victory();
        coach.fail();
    }
}
