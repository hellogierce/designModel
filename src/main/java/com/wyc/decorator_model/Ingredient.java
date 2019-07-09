package com.wyc.decorator_model;

public abstract class Ingredient {
    abstract String getDescription();
    abstract double getCost();
    void print(){
        System.out.println("name-----"+this.getDescription());
        System.out.println("price-----"+this.getCost());
    }
}
