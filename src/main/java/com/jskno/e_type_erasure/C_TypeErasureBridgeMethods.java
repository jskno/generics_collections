package com.jskno.e_type_erasure;

public class C_TypeErasureBridgeMethods {

    public static void main(String[] args) {

    }

}

// AFTER TYPE ERASURE (THE BYTECODE GENERATED BY THE COMPILER)
class Node<T> {

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class MyNode extends Node<Integer> {

    public MyNode(Integer data) {
        super(data);
    }

    @Override
    public void setData(Integer data) {
        super.setData(data);
    }
}

// BEFORE TYPE ERASURE (WHAT THE PROGRAMMER WRITES)
class NodeErasure {

    private Object data;

    public NodeErasure(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

class MyNodeErasure extends NodeErasure {

    public MyNodeErasure(Integer data) {
        super(data);
    }

    //@Override       //      <---- Problem Compile error
    public void setData(Integer data) {
        super.setData(data);
    }
}

// As you can see after type erasure there is a problem: the setData() method args do not match
// Java compiler is going to create a method in order to solve this problem --> this is the bridge method

class MyNodeErasureWithBridge extends NodeErasure {

    public MyNodeErasureWithBridge(Integer data) {
        super(data);
    }

    @Override
    public void setData(Object data) {      //  <---- This is the bridge method
        setData((Integer) data);
    }

    //@Override
    public void setData(Integer data) {
        super.setData(data);
    }
}