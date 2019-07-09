package com.wyc.decorator_model;

public class GreenGrocery extends Decorator {
    public GreenGrocery(Ingredient ingredient) {
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
        double greenGroceryPrice=0.6;
        return basePrice+greenGroceryPrice;
    }
}
