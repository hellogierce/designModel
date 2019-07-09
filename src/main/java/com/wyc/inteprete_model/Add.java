package com.wyc.inteprete_model;
//非终结符表达式:对文法中的每一条规则对应一个非终结符表达式
public class Add extends Expression{
    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context con) {
        return left.interpret(con)+right.interpret(con);
    }
}
