package com.wyc.facade_model;

public class Address {
    String address;
    String city;
    String state;

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public boolean isValid(){
        System.out.println("address 验证通过!");
        return true;
    }
    public boolean save(){
        System.out.println("address 成功保存!");
        return true;
    }
}
