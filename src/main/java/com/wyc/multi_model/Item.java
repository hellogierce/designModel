package com.wyc.multi_model;

public class Item {
    String itemId;
    String itemName;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Item(String itemId) {
        this.itemId = itemId;
    }
}
