package com.wyc.decorator_model;

public abstract class Decorator extends Ingredient {
    Ingredient ingredient;

    public Decorator(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    abstract String getDescription();
    abstract double getCost();
}
