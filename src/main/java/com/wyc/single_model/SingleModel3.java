package com.wyc.single_model;

import java.util.Vector;

/**
 * 使用时实例化,更新成员变量
 */
public class SingleModel3 {
    private static  SingleModel3 instance=null;
    private Vector properties=null;
    private SingleModel3(){

    }
    public static synchronized SingleModel3 getInstance(){
        syncInit();
        return instance;
    }
    public static synchronized void syncInit(){
        if (instance==null){
            instance=new SingleModel3();
        }
    }
    public synchronized void updateProperties(){
        //更新属性
    }

    public Vector getProperties() {
        return properties;
    }
}
