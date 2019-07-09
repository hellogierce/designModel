package com.wyc.multi_model;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * 在线购物下订单
 * 一个购物车只能让一个用户使用,一个商品一个订单
 * 购物车里面放多个订单
 */
public class ShoppingCart {
    private ShoppingCart shoppingCart=null;
    private static HashMap<String,ShoppingCart> instance=new HashMap<>();
    private ArrayList<ItemOrder> orderedItems=null;
    private int readCount=0;//更新器,读计数器,只有为0时才更新数量
    private ShoppingCart(){//一有购物车,订单列表就生成
        orderedItems=new ArrayList<ItemOrder>();
    }
    public synchronized  static ShoppingCart getInstance(String user){
        ShoppingCart shoppingCart=instance.get(user);
        if (null==shoppingCart){
            shoppingCart=new ShoppingCart();
            instance.put(user, shoppingCart);
        }
        return shoppingCart;
    }
    public synchronized  void removeShoppingCart(String user){
        instance.remove(user);
    }
    public ArrayList<ItemOrder> getOrderedItems(){
        readIn();
        readOut();
        return orderedItems;
    }

    /**
     * 管理订单
     * 如果是旧订单则更新其数量
     * 如果是新订单则添加到订单列表
     * @param itemId 订单id
     * itemorder 订单:商品item ,已购买数量numItems
     * item  商品:有itemId  itemName
     */
    public void addItem(String itemId){
        updateIn();
        ItemOrder itemOrder=null;
        for(int i=0;i<orderedItems.size();i++){
            itemOrder=orderedItems.get(i);
            if (itemOrder.getItem().getItemId().equals(itemId)){
                itemOrder.incrementNumItems();//再添加一件同样的商品
                return;
            }
        }
        ItemOrder newOrder=new ItemOrder(new Item(itemId),1);
        orderedItems.add(newOrder);
    }
/**
 * 管理订单数量
  */
    public synchronized  void setNumOrdered(String itemId,int numOrdered){
        updateIn();
        ItemOrder order=null;
        for(int i=0;i<orderedItems.size();i++){
            order=orderedItems.get(i);
            if (order.getItem().getItemId().equals(itemId)){
                if (numOrdered<=0){
                    orderedItems.remove(i);
                }else{
                    order.setNumItems(numOrdered);
                }
                return;
            }
        }
        ItemOrder newOrder=new ItemOrder(new Item(itemId),numOrdered);
        orderedItems.add(newOrder);
    }
    private synchronized void updateIn(){
        while (readCount>0){
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private synchronized void readIn(){
        readCount++;
    }
    private synchronized void readOut(){
        readCount--;
        notify();
    }
}
