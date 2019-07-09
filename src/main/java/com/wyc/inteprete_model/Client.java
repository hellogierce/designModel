package com.wyc.inteprete_model;

/**
 * 测试(a*b)/(a-b+2)
 */
public class Client {
    public static void main(String[] args) {
        Context con=new Context();
        Variable a=new Variable();
        Variable b=new Variable();
        Constant c=new Constant(1);
        con.addValue(a, 5);
        con.addValue(b, 7);
        Expression ex=new Division(new Multiply(a, b), new Add(new Subtract(a, b), c));
        System.out.println(ex.interpret(con));
    }
}
