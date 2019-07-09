package com.wyc.zhongjie_model;

/**
 * 媒人
 */
public class Matchmaker {
    Man man;
    Woman woman;

    public Matchmaker() {
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }
    public void doManTryst(String says){
        woman.thinking(says);
    }
    public void doWomanTryst(String says){
        man.thinking(says);
    }
    public void registeMan(Man man){
        this.man=man;
    }
    public void registeWoman(Woman woman){
        this.woman=woman;
    }

    public static void main(String[] args) {
        Matchmaker mat=new Matchmaker();
        Man man=new Man(mat);
        Woman woman=new Woman(mat);
        man.tryst("我可以和你见面吗?");
        woman.tryst("你多大?");
    }
}
