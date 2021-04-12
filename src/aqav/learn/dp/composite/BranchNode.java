package aqav.learn.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {

    private String name;
    private List<Node> nodes = new ArrayList<>();

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
