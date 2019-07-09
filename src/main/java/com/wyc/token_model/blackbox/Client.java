package com.wyc.token_model.blackbox;

public class Client {
    public static void main(String[] args) {
        Originator o=new Originator();
        Caretaker c=new Caretaker();
        o.setState("on");
        c.saveMemento(o.createMemento());
        o.setState("off");
        o.restoreMemento((Originator.NeibuMemento) c.retrieveMemento());
        Memento m=o.getMemento();
        m.hi();
    }
}
