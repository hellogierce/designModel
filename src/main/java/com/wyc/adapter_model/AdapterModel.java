package com.wyc.adapter_model;

/**
 * 适配器模型:对象适配器 使用一个对象作为变量
 * 知识点:
 * 原来的功能的代码不能动,写一个适配器(实现原功能)
 */
public class AdapterModel implements DBsocketInterface {
    GBsocketInterface gBsocket;

    public AdapterModel(GBsocketInterface gBsocket) {
        this.gBsocket = gBsocket;
    }

    public void powerWithTwoRound() {
        gBsocket.powerWithThirdFlat();
    }

    public static void main(String[] args) {
//旧的
/*        DBsocket dBsocket=new DBsocket();
        Hotel hotel=new Hotel(dBsocket);
        hotel.charging();*/
//新的
        GBsocket gBsocket=new GBsocket();
        AdapterModel adapterModel=new AdapterModel(gBsocket);
        Hotel hotel=new Hotel(adapterModel);
        hotel.charging();
    }
}

interface DBsocketInterface {
    void powerWithTwoRound();
}

class DBsocket implements DBsocketInterface {
    public void powerWithTwoRound() {
        System.out.println("德标使用2源头供电!");
    }
}

class Hotel {
    DBsocketInterface dBsocket;

    public Hotel(DBsocketInterface dBsocket) {
        this.dBsocket = dBsocket;
    }

    public DBsocketInterface getdBsocket() {
        return dBsocket;
    }

    public void setdBsocket(DBsocketInterface dBsocket) {
        this.dBsocket = dBsocket;
    }

    public void charging() {
        dBsocket.powerWithTwoRound();
    }
}

interface GBsocketInterface {
    void powerWithThirdFlat();
}

class GBsocket implements GBsocketInterface {
    public void powerWithThirdFlat() {
        System.out.println("国标使用3扁头供电!");
    }
}
