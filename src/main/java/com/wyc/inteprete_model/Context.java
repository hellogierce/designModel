package com.wyc.inteprete_model;

import java.util.HashMap;
import java.util.Map;

//上下文,包含解释器之外的一些全局信息
public class Context {
    private Map valueMap=new HashMap();
    public void addValue(Variable x,int y){
        Integer yi=new Integer(y);
        valueMap.put(x, y);
    }
    public int lookupValue(Variable x){
        int i=((Integer) (valueMap.get(x))).intValue();
        return i;
    }
}
