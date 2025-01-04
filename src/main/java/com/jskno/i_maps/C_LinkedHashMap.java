package com.jskno.i_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class C_LinkedHashMap {

    public static void main(String[] args) {

        // The insertion order is not preserved
        Map<String, Integer> map = new HashMap<>();

        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
        map.put("eee", 5);
        map.put("fff", 6);
        map.put("ggg", 7);
        map.put("hhh", 8);
        map.put("iii", 9);
        map.put("jjj", 10);

        System.out.println("******************************");
        System.out.println("Printed a hashmap:");
        System.out.println("******************************");
        for(String key: map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }


        // There is a doubly linked list connecting the inserted items, so the order of insertion is preserved
        // LinkedHashMap needs more memory because its structure is more complex (Double linked)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("aaa", 1);
        linkedHashMap.put("bbb", 2);
        linkedHashMap.put("ccc", 3);
        linkedHashMap.put("ddd", 4);
        linkedHashMap.put("eee", 5);
        linkedHashMap.put("fff", 6);
        linkedHashMap.put("ggg", 7);
        linkedHashMap.put("hhh", 8);
        linkedHashMap.put("iii", 9);
        linkedHashMap.put("jjj", 10);

        System.out.println("******************************");
        System.out.println("Printed a linkedhashmap:");
        System.out.println("******************************");
        for(String key: linkedHashMap.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }
    }

}
