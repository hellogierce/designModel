package com.wyc.iterator_model;

public class Client {
    public static void main(String[] args) {
        Hall hall=new Hall(4);
        hall.add(new Tree("apple"));
        hall.add(new Tree("pear"));
        hall.add(new Tree("orange"));
        hall.add(new Tree("pineApple"));
        for(Iterator i=hall.connectIterator();i.hasNext();){
            String type=((Tree)i.next()).getName();
            if ("apple".equals(type)){
                System.out.println("使用苹果农药");
            }else if ("pear".equals(type)){
                System.out.println("使用鸭梨农药");
            }else if("orange".equals(type)){
                System.out.println("使用橘子农药");
            }else{
                System.out.println("使用凤梨农药");
            }
        }
    }
}
