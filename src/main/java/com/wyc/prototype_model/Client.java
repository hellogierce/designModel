package com.wyc.prototype_model;

/**
 * 使用序列化来深拷贝,只能复制当前类的属性,其父类属性不能复制
 */
public class Client {
    public static void main(String[] args) {
        SoupSpoon soup=new SoupSpoon("gold");
        SoupSpoon soup2= (SoupSpoon) soup.deepClone();
        System.out.println(soup2.getSpoonName());
        System.out.println(soup2.getMaterial());
//        if (soup.hashCode()==soup2.hashCode()){
//            System.out.println("hashcode == ");
//        }else if(soup.equals(soup2)){
//            System.out.println("equals");
//        } else{
//            System.out.println("false");
//        }
    }
}
