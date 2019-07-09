package com.wyc.flyweight_model;

import java.util.HashMap;
import java.util.Map;

public class FlavorFactory {
    private Map<String,Order> flavorPool=new HashMap<>(100);//可以去重

    private static FlavorFactory flavorFactory=new FlavorFactory();
    public static FlavorFactory getInstance(){
        return flavorFactory;
    }
    public Order getOrder(String flavor){
        Order order=null;
        if (flavorPool.containsKey(flavor)){
            order=flavorPool.get(flavor);
        }else{
            order=new FlavorOrder(flavor);
            flavorPool.put(flavor, order);
        }
        return order;
    }

    /**
     * 获得咖啡种类
     * @return
     */
    public int getTotalFlavorsMade(){
        return flavorPool.size();
    }


}
