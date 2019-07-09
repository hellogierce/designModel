package com.wyc.decorator_model;

public class Mutton extends Decorator {
    public Mutton(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    String getDescription() {
        String base=ingredient.getDescription();
        return base+" decorate with mutton";
    }

    @Override
    double getCost() {
        double basePrice=ingredient.getCost();
        double muttonPrice=2.3;
        return basePrice+muttonPrice;
    }
}
