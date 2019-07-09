package com.wyc.template_model;
//订单汇总
public class Orderimpl extends Order{
    int orderId;
    int total;

    public Orderimpl(int orderId, int total) {
        this.orderId = orderId;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
