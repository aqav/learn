package aqav.learn.dp.composite;

public class LeafNode extends Node{

    private String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
