package com.wyc.token_model.whitebox;

/**
 * 发起人
 */
public class Originator {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态"+state);
    }

    // 创建备忘
    public Memento createMemento() {
        return new Memento(state);
    }

    //恢复成备忘状态
    public void restoreMemento(Memento memento) {
        this.state=memento.getState();
        System.out.println("当前状态"+state);
    }

}
