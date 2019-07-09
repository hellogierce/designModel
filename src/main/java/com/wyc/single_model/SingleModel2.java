package com.wyc.single_model;

/**
 * 使用时实例化
 */
public class SingleModel2 {
    private static  SingleModel2 instance = null;
    private SingleModel2(){

    }
    public static synchronized SingleModel2 getInstance(){
        if (instance==null){
            instance=new SingleModel2();
        }
        return instance;
    }
}
