package com.wyc.single_model;

/**
 * 有上限多例模式
 */
public class Die {
    private static Die die1=new Die();
    private static Die die2=new Die();
    private Die(){

    }
    public static Die getInstance(int sequence){
        if (1==sequence){
            return die1;
        }else{
            return die2;
        }
    }

    /**
     * 获得一个1-6间的随机数
      * @return
     */
    public synchronized int getNum(){
        int result=0;
        double a=java.lang.Math.random();//0-1之间的随机数
        int b=(new Double(a*100)).intValue();
        result=(b%6)+1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Die.getInstance(1).getNum());
        System.out.println(Die.getInstance(2).getNum());
    }
}
