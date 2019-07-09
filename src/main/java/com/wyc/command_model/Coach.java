package com.wyc.command_model;

public class Coach implements BossCommand {
    Player player;

    public Coach(Player player) {
        this.player = player;
    }

    @Override
    public void victory() {
        player.run();
        player.shoot();
        System.out.println("赢得胜利");
    }

    @Override
    public void fail() {
        player.stop();
        System.out.println("输了比赛");
    }
}
