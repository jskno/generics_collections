package com.jskno.e_type_erasure.exercise;

import java.util.ArrayList;
import java.util.List;

public class LibraryGenerics<T extends Algorithm> {

    private final List<T> algorithms;

    public LibraryGenerics() {
        this.algorithms = new ArrayList<>();
    }

    public void add(T algorithm) {
        this.algorithms.add(algorithm);
    }

    public T getLast() {
        if(algorithms.size() <= 0) return null;
        return algorithms.removeLast();
    }
}
