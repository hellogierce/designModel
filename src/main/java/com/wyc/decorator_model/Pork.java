package com.wyc.decorator_model;

public class Pork extends Decorator {
    public Pork(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    String getDescription() {
        String base=ingredient.getDescription();
        return base+" decorate with pork";
    }

    @Override
    double getCost() {
        double basePrice=ingredient.getCost();
        double porkPrice=1.8;
        return basePrice+porkPrice;
    }
}
