package com.jskno.i_maps;

import java.util.Map;
import java.util.TreeMap;

public class E_TreeMapVsHashMap {

    // On average HashMap outperforms TreeMap because for these operations TreeMap has O(logN) and HashMap O(1) time complexity
    public static void main(String[] args) {

        // TreeMap
        // O(logN)
        Map<Integer, Integer> treeMap = new TreeMap<>();

        long now = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            treeMap.put(i, i);
        }

        for (int i = 0; i < 500_000; i++) {
            treeMap.get(i);
        }

        System.out.println("Time taken with TreeMap: " + (System.currentTimeMillis() - now));

        // HashMap
        // O(1)
        Map<Integer, Integer> hashMap = new TreeMap<>();

        now = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            hashMap.put(i, i);
        }

        for (int i = 0; i < 500_000; i++) {
            hashMap.get(i);
        }

        System.out.println("Time taken with HashMap: " + (System.currentTimeMillis() - now));

    }

}
