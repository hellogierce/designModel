package com.wyc.template_model;

import java.util.List;

public class ConcreteOrder extends AbstractOrder {
    @Override
    public int getOrderItemPrice(OrderItem orderItem) {
        return 0;
    }

    @Override
    public int getSpendingLimit(int customerId) {
        return 0;
    }

    @Override
    public int saveOrder(int customerId, int total, List orderItemList) {
        return 0;
    }
}
