package com.jskno.n_reflection.model;

public class Test {

    private String name;

    public Test() {
    }

    private Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This is a Test object: {}";
    }
}
