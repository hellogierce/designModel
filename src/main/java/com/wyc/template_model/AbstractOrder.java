package com.wyc.template_model;


import java.util.List;

public abstract class AbstractOrder {
    //模板方法
    public Order placeOrder(int customerId, List orderItemList) throws Exception {
        int total=0;
        for (int i=0;i<orderItemList.size();i++){
            OrderItem orderItem=(OrderItem)orderItemList.get(i);
            total+=getOrderItemPrice(orderItem)*orderItem.getQuantity();
        }
        if (total>getSpendingLimit(customerId)){
            throw new Exception("超出信用额度");
        }
        int orderId= (int) saveOrder(customerId,total,orderItemList);
        return new Orderimpl(orderId,total);
    }
    public abstract int getOrderItemPrice(OrderItem orderItem);
    public abstract int getSpendingLimit(int customerId);
    public abstract int saveOrder(int customerId, int total, List orderItemList);
}
