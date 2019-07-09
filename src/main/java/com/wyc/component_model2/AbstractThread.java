package com.wyc.component_model2;

import java.util.ArrayList;
import java.util.List;

public abstract  class AbstractThread implements IThread{
    boolean isTop;
    String content;
    List<IThread> list=new ArrayList<>();

    public boolean isTop() {
        return isTop;
    }

    public void setTop(boolean top) {
        isTop = top;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<IThread> getList() {
        return list;
    }

    public void setList(List<IThread> list) {
        this.list = list;
    }

    @Override
    public void add(IThread thread) {
        list.add(thread);
    }

    @Override
    public void remove(IThread thread) {
        list.remove(thread);
    }
    @Override
    public abstract  void renderContent() ;
}
