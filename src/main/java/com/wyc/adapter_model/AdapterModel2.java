package com.wyc.adapter_model;
/**
 * 适配器模型:类适配器 继承一个类,实现一个接口
 * 知识点:
 * 原来的功能的代码不能动,写一个适配器(实现原功能)
 */
public class AdapterModel2 extends GBsocket implements DBsocketInterface {
    @Override
    public void powerWithTwoRound() {
        this.powerWithThirdFlat();
    }

    public static void main(String[] args) {
//旧的
/*        DBsocket dBsocket=new DBsocket();
        Hotel hotel=new Hotel(dBsocket);
        hotel.charging();*/
//新的
        GBsocket gBsocket=new GBsocket();
        AdapterModel2 adapterModel=new AdapterModel2();
        Hotel hotel=new Hotel(adapterModel);
        hotel.charging();
    }
}