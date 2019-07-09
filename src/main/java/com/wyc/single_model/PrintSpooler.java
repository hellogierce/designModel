package com.wyc.single_model;

/**
 * 单例类的方法使用:
 * 3 构造器private
 *   private static boolean 表示单例对象 true表示存在
 */
public class PrintSpooler {
    private static  boolean flag=false;
    private PrintSpooler() {
        if (!flag){
            try {
                throw new Exception("不满足要求");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            flag=true;
        }
    }
    public void close(){
        flag=false;
    }
}
