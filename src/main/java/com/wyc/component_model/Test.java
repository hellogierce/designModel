package com.wyc.component_model;

public class Test {
    public static void main(String[] args) {
        Manage root = new Manage("root");
        root.add(new Leaf("叶子a"));
        root.add(new Leaf("叶子b"));
        Manage branch=new Manage("branch");
        branch.add(new Leaf("叶子c"));
        branch.add(new Leaf("叶子d"));
        Manage cha=new Manage("cha");
        cha.add(new Leaf("叶子e"));
        cha.add(new Leaf("叶子f"));
        root.add(branch);
        branch.add(cha);
        root.display(0);
    }
}
