package com.jskno.l_collections_class.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cache {

    // we can store up to 5 items in the cache
    private static final int CAPACITY = 5;
    // let's use a list to store the items (URLs)
    private List<Pair> cache;

    // YOUR IMPLEMENTATION HERE !!!
    public Cache() {
        this.cache = new ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            this.cache.add(new Pair(null, null));
        }
    }

    // I need it to test your implementation
    public List<Pair> getCache() {
        return cache;
    }

    public void showCache() {
        for (Pair pair : cache) {
            System.out.println(pair);
        }
    }

    public void search(String url) {
        Pair pair = new Pair(url, "Content of " + url.substring(4, url.lastIndexOf(".")));
        int index = this.cache.indexOf(pair);
        if (index == -1) {
            Collections.rotate(this.cache, 1);
            cache.set(0, pair);
        } else {
            this.cache.remove(index);
            this.cache.add(0, pair);
        }
    }

}
