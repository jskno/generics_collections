package com.jskno.l_collections_class.exercise_solved;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private static final int CAPACITY = 5;
    private List<Pair> cache;

    public Cache() {
        this.cache = new ArrayList<>();
    }

    public void search(String url) {

        Pair searchedItem = null;

        // we check if the item is already present in the data structure
        for(int i=0;i<cache.size();++i) {
            System.out.println("HEY: "+cache.get(i).getUrl());
            if(cache.get(i).getUrl().equals(url)) {
                searchedItem = cache.get(i);
            }
        }

        // we have it in the cache already
        if(searchedItem!=null) {
            System.out.println("It is in the cache ... "+url);
            cache.remove(searchedItem);
            cache.add(0, searchedItem);
        } else {
            // insert to the beginning of the cache
            System.out.println("Not in the cache so insert it ... "+url);

            Pair newPair = new Pair(url,"Random data for a given URL...");

            // we have to deal with the bound (capacity) - remove the last item if cache is full
            if(cache.size()>=CAPACITY) cache.remove(CAPACITY-1);

            // if it is the first item
            if(cache.size() == 0) {
                // If the array is empty then we are not able to insert with index 0
                cache.add(newPair);
            } else {
                // if it is not the first item then we can insert to the first slot (index 0)
                cache.add(0, newPair);
            }
        }
    }

    public void showCache() {
        for(Pair pair : cache)
            System.out.println(pair);
    }

}
