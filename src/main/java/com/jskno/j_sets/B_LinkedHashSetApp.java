package com.jskno.j_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class B_LinkedHashSetApp {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Adam");
        hashSet.add("Kevin");
        hashSet.add("Daniel");
        hashSet.add("Joe");
        hashSet.add("Ana");

        System.out.println("Printing with insertion order");
        for (String name: hashSet) {
            System.out.println(name);
        }

        // LinkedHashSet maintains the insertion order
        // Doubly Linked list connecting the items
        // It needs more memory that Hashset
        Set<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Adam");
        linkedSet.add("Kevin");
        linkedSet.add("Daniel");
        linkedSet.add("Joe");
        linkedSet.add("Ana");

        System.out.println("Printing with insertion order");
        for (String name: linkedSet) {
            System.out.println(name);
        }
    }

}
