package com.wyc.inteprete_model;
//抽象表达式角色:声明一个抽象的解释操作
public abstract class Expression {
    public abstract int interpret(Context con);
}
