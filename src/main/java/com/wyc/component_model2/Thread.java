package com.wyc.component_model2;

public class Thread extends AbstractThread{
    @Override
    public void renderContent() {
        System.out.println("thread:"+this.content);
        for(IThread obj:list){
            obj.renderContent();
        }
    }
}
