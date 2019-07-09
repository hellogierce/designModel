package com.wyc.component_model2;

public class Message extends AbstractThread {
    @Override
    public void renderContent() {
        System.out.println("message:"+this.content);
        for(IThread obj:list){
            obj.renderContent();
        }
    }
}
