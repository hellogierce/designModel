package com.wyc.single_model;

/**
 * 加载时实例化
 */
public class SingleModel1 {
    private static final SingleModel1 instance=new SingleModel1();
    private SingleModel1(){

    }
    public static synchronized SingleModel1 getInstance(){
        return instance;
    }
}
