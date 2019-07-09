package com.wyc.flyweight_model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Order> orders=new ArrayList<>(100);//不能去重
    private static FlavorFactory flavorFactory=FlavorFactory.getInstance();
    private static void tabkeOrders(String flavor){
        orders.add(flavorFactory.getOrder(flavor));
    }
    public static void main(String[] args) {
        tabkeOrders("摩卡");
        tabkeOrders("卡布奇诺");
        tabkeOrders("烧仙草");
        tabkeOrders("拿铁");
        tabkeOrders("蓝山");
        tabkeOrders("摩卡");
        tabkeOrders("摩卡");
        tabkeOrders("蓝山");
        for(Order order:orders){
            order.sell();
        }
        System.out.println("一共卖了咖啡数:"+orders.size());
        System.out.println("一共卖了咖啡种类数:"+flavorFactory.getTotalFlavorsMade());
    }
}
