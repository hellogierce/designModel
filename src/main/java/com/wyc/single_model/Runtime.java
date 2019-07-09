package com.wyc.single_model;

/**
 *  单例类的方法使用:
 *  2 构造器private
 *    private static 类对象
 *    使用该对象是使用static 的getInstance()方法
 */
public class Runtime {
    private static Runtime current=new Runtime();
    private Runtime(){

    }
    public static Runtime getInstance(){
        return current;
    }

}
