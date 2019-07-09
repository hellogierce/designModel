package com.wyc.inteprete_model;
//终结符表达式:实现与文法中的终结符相关联的解释操作
public class Constant extends Expression {
    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context con) {
        return i;
    }
}
