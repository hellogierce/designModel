package com.wyc.made_model;

import java.util.ArrayList;
import java.util.List;

public  class Car {
    private Body body;
    private Engine engine;
    private List<Wheel> wheels;

    void addBody(Body body){
        this.body=body;
    }
    void addEngine(Engine engine){
        this.engine=engine;
    }
    void addWheel(Wheel wheel){
        if (null==wheels){
            wheels=new ArrayList<>();
        }
        wheels.add(wheel);
    }
    void showMe(){
        if (!(body!=null&&engine!=null&&wheels.size()>0)){
            System.out.println("the car not complete");
        }else{
            System.out.println("this car with "+body.getName()+" "+engine.getName()+" ");
            for (int i=0;i<wheels.size();i++){
                System.out.println("this car with "+(i+1)+" "+wheels.get(i).getName());
            }
        }
    }
}
