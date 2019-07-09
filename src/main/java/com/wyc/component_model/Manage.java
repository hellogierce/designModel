package com.wyc.component_model;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点:定义行为,存储叶子节点对象
 */
public class Manage extends Component {
    List<Component> children=new ArrayList<>();

    public Manage(String name) {
        super(name);
    }

    @Override
    void add(Component component) {
        children.add(component);
//        System.out.println(this.name+"添加:"+component.name);
    }

    @Override
    void remove(Component component) {
        children.remove(component);
//        System.out.println(this.name+"删除:"+component.name);
    }
//这里是递归用法,每深一层depth+1
    @Override
    void display(int depth) {
        for(Component c:children){
            c.display(depth+1);
        }
    }
}
