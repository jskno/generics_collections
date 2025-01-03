package com.jskno.i_maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class D_TreeMapIntro {

    public static void main(String[] args) {

        // All the operations have O(logN) logarithmic time complexity
        // Insertion and removal of last item in HashMap O(1) < O(logN) insertion and removal of item in the TreeMap
        // Why to use TreeMap
        // - it keeps the item in a sorted order
        // - it is deterministic, all ops have guaranteed O(logN) for best/case scenarios
        //          (HashMap with collision or defect hash function can give rise to O(N))
        // - search

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "ten");
        map.put(3, "three");
        map.put(5, "five");
        map.put(1, "one");
        map.put(8, "eight");

        System.out.println("Smallest key: " + map.lastKey());
        System.out.println("Largest key: " + map.firstKey());

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Map<Integer, String> reverseMap = new TreeMap<>(Comparator.reverseOrder());

        reverseMap.put(10, "ten");
        reverseMap.put(3, "three");
        reverseMap.put(5, "five");
        reverseMap.put(1, "one");
        reverseMap.put(8, "eight");

        for(Map.Entry<Integer, String> entry: reverseMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

}
