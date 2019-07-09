package com.wyc.component_model;

/**
 * 子节点对象
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    public void add(Component c) {
        System.out.println("Can not add to a leaf");
    }

    public void remove(Component c) {
        System.out.println("Can not remove from a leaf");
    }

    @Override
    void display(int depth) {
        String tmp="";
        for (int i=0;i<depth;i++) {
            tmp+="-";
        }
        System.out.println(tmp+this.name);
    }
}
