package com.wyc.visitor_model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new PA());
        list.add(new PB());
        for(Iterator i=list.iterator();i.hasNext();){
            Person person= (Person) i.next();
            person.run();
        }
    }
}
