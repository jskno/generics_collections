package com.jskno.l_collections_class.model;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

public class FixedSizeListUniqueElements<E> extends AbstractList<E> {

    private final Object[] elements;

    public FixedSizeListUniqueElements(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be non-negative");
        }
        this.elements = new Object[capacity];
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
