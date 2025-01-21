package com.jskno.l_collections_class.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {

    private List<Node> neighbors;

    public Node() {
        this.neighbors = new ArrayList<>();
    }

    // In this case we are passing our list by reference and the caller can manipulate and modify my internal structure (my list)
    public List<Node> getNeighbors() {
        return neighbors;
    }

    // If we can prevent from updating our neighbors list
    public List<Node> getNeighbors2() {
        return Collections.unmodifiableList(neighbors);
    }


}
