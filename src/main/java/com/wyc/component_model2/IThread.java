package com.wyc.component_model2;

public interface IThread {
    void add(IThread thread);
    void remove(IThread thread);
    void renderContent();
}
