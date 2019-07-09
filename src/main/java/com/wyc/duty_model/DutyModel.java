package com.wyc.duty_model;

/**
 * 责任型模式:击鼓传花
 * 1tangshen---->2sunwukong----->3zhubajie---->4shashen----->tangshen
 * 大部分遇见的是不纯的责任链模式:
 * 纯:处理者只能承担责任,或者责任往下推.不能既承担责任,又往下推.
 */
public class DutyModel {
    public static void main(String[] args) {
        Player tangeshen=new Tangshen(new Sunwukong(new Zhubajie(new Shashen(null))));
        tangeshen.handle(4);
    }
}
