package com.wyc.gouzao_model;

public class Manager extends Employee {
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Manager(String dept) {
        this.dept=dept;
    }
    public Manager(String name,double salary){
        super(name,salary);
    }
    public Manager(String name, double salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }
}
