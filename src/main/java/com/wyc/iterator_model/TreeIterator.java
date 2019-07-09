package com.wyc.iterator_model;


public class TreeIterator implements Iterator {
    private int last=0;
    private Hall hall;

    public TreeIterator(Hall hall) {
        this.hall = hall;
    }

    @Override
    public boolean hasNext() {
        if (last<hall.trees.length){
            return true;
        }
        return false;
    }

    @Override
    public Tree next() {
        Tree tree=hall.trees[last];
        last++;
        return tree;
    }
}
