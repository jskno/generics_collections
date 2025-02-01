package com.jskno.n_reflection.model;

public class Test2 {

    private String name;

    private Test2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This is a Test object with name: {" + name + "}";

    }
}
