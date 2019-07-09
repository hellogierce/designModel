package com.wyc.single_model;

/**
 * 单例类的方法使用:
 * 1 final 类 private 构造器 所有方法static
 */
public final class Math {
    private Math(){

    }
    public static int round(float a){
        return (int)java.lang.Math.floor(a);
    }
}
