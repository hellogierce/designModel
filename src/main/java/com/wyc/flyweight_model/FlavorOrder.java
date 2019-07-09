package com.wyc.flyweight_model;

public class FlavorOrder extends Order {
    private String flavor;

    public FlavorOrder(String flavor) {
        this.flavor = flavor;
    }

    @Override
    void sell() {
        System.out.println("sell caffee of "+flavor);
    }

    @Override
    String getFlavor() {
        return flavor;
    }
}
