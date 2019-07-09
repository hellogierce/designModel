package com.wyc.zhongjie_model;

public class Woman {
    Matchmaker mat;

    public Woman(Matchmaker mat) {
        this.mat = mat;
        mat.registeWoman(this);
    }
    public boolean thinking(String says){
        boolean flag=false;
        if (says.length()>5){
            System.out.println("女方说,我同意了!");
            flag=true;
        }else{
            System.out.println("女方说,我不同意了!");
        }
        return flag;
    }
    public void tryst(String says){
        System.out.println("女方提出约会,说---"+says);
        mat.doWomanTryst(says);
    }
}
