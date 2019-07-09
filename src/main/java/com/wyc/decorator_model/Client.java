package com.wyc.decorator_model;

public class Client {
    public static void main(String[] args) {
        Ingredient compound=new Mutton(new Celery(new Pork(new Bread("2肉1菜堡"))));
        compound.print();
    }
}
