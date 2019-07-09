package com.wyc.multi_model;

public class ItemOrder {
    Item item;
    int numItems;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public ItemOrder(Item item, int numItems) {
        this.item = item;
        this.numItems = numItems;
    }

    public void incrementNumItems() {
        numItems++;
    }
}
