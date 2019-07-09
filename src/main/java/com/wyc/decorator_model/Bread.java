package com.wyc.decorator_model;

public class Bread extends Ingredient {
    String description;

    public Bread(String description) {
        this.description = description;
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double getCost() {
        return 2.5;
    }
}
