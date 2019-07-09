package com.wyc.inteprete_model;
//终结符表达式:实现与文法中的终结符相关联的解释操作
public class Variable extends Expression {
    @Override
    public int interpret(Context con) {
        return con.lookupValue(this);
    }
}
