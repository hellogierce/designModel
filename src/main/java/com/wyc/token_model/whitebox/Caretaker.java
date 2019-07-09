package com.wyc.token_model.whitebox;

/**
 * 管理人
 */
public class Caretaker {
    Memento memento;
//提取备忘
    public Memento retrieveMemento() {
        return this.memento;
    }
//保存备忘
    public void saveMemento(Memento memento){
        this.memento=memento;
        System.out.println("备忘录当前状态"+memento.state);
    }
}
