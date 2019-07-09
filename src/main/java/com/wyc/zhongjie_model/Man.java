package com.wyc.zhongjie_model;

public class Man {
    Matchmaker mat;

    public Man(Matchmaker mat) {
        this.mat = mat;
        mat.registeMan(this);
    }

    /**
     * 处理女方说的话
     * @param says 女方说的话
     * @return
     */
    public boolean thinking(String says){
        boolean flag=false;
        if (says.length()>5){
            System.out.println("男方说,我同意了!");
            flag=true;
        }else{
            System.out.println("男方说,我不同意了!");
        }
        return flag;
    }

    /**
     * 处理男方自己的话
     * @param says 男方自己的话
     */
    public void tryst(String says){
        System.out.println("男方提出约会,说---"+says);
        mat.doManTryst(says);
    }
}
