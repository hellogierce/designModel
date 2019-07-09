package com.wyc.facade_model;

public class Account {
    String firstName;
    String lastName;

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isValid(){
        System.out.println("account 验证通过!");
        return true;
    }
    public boolean save(){
        System.out.println("account 成功保存!");
        return true;
    }
}
