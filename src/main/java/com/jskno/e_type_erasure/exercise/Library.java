package com.jskno.e_type_erasure.exercise;

import java.util.ArrayList;
import java.util.List;

class Library<Algorithm> {

    private final List<Algorithm> algorithms = new ArrayList<>();
    private int counter = 0;

    public void add(Algorithm algorithm) {
        this.algorithms.add(algorithm);
    }

    public Algorithm getLast() {
        Algorithm item = null;
        if (counter < algorithms.size()) {
            item = algorithms.get(counter);
            counter++;
        }
        return item;
    }
}
