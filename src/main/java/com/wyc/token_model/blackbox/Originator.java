package com.wyc.token_model.blackbox;

/**
 * 发起人
 */
public class Originator {
    String state;
    Memento memento;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态"+state);
    }

    // 创建备忘
    public Memento createMemento() {
        this.memento= new NeibuMemento(state);
        return memento;
    }

    //恢复成备忘状态
    public void restoreMemento(NeibuMemento memento) {
        this.setState(memento.savedState);
    }
    public Memento getMemento(){
        return memento;
    }
    class NeibuMemento implements Memento{
        private String savedState;

        public String getSavedState() {
            return savedState;
        }

        public void setSavedState(String savedState) {
            this.savedState = savedState;
        }

        private NeibuMemento(String savedState){
            this.savedState=savedState;
        }
        @Override
        public void hi() {
            System.out.println("method of nei bu class");
        }
    }
}
