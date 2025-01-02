package com.jskno.i_maps;

import java.util.HashMap;
import java.util.Map;

public class A_HashMapApp {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // Insert into the map in O(1) constant running time complexity IF THERE IS NO COLLISION
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(3, "Ana");
        map.put(40, "Lucy");
        map.put(null, "This is a null");

        // We cna retrieve items based on keys O(1)
        System.out.println(map.get(1));
        System.out.println(map.get(40));
        System.out.println(map.get(70));
        System.out.println(map.get(null));

        for (Integer key: map.keySet()) {
            System.out.println(map.get(key));
        }

        // Remove items in O(1) when no COLLISION
        map.remove(2);
        map.remove(1050);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
