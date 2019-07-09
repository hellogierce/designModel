package com.wyc.decorator_model;

public class Celery extends Decorator {
    public Celery(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    String getDescription() {
        String base=ingredient.getDescription();
        return base+" decorate with celery";
    }

    @Override
    double getCost() {
        double basePrice=ingredient.getCost();
        double celeryPrice=0.6;
        return basePrice+celeryPrice;
    }
}
