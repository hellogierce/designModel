package com.wyc.iterator_model;

public class Hall {
    Tree[] trees;
    int index;

    public Hall(int maxNumber) {
        trees=new Tree[maxNumber];
        this.index = 0;
    }
    public void add(Tree tree){
        trees[index]=tree;
        index++;
    }
    public Iterator connectIterator(){
        return new TreeIterator(this);
    }
}
