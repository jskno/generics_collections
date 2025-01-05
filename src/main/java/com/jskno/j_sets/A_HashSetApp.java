package com.jskno.j_sets;

import java.util.HashSet;
import java.util.Set;

public class A_HashSetApp {

    public static void main(String[] args) {

        // Initial capacity = 16 (until 16 items without resizing)
        // As HashSet is relying on a HashTable all the features are the same:
        // - All operations have O(1) if there is no collision
        // - Memory heavy
        // - When collision worst case scenario: O(logN) after updated to a RedBlackTree (it used to be O(n))
        Set<String> set = new HashSet<>();

        // Java will transform the input Adam into an array index
        // 1. The set has a pointer property that contains the address of the first element
        // 2. The 16 consecutive locations in memory belongs to the set
        // 3. The hash function convert the value Adam to a value between 0 and 15
        // 4. The term is located in the initialAddressPointer + hashValue
        // 5. This is done for all terms
        // 6. Where there is collision the values that belong to the same array index are stored into a LinkedHashList before now in a RedBlackTree
        set.add("Adam");
        set.add("Mary");
        set.add("Katy");
        set.add("Ana");
        // There is no duplicates in the Set. The value is a key.
        // The object store must implement the HashCode and Equals method to be able to compare objects
        set.add("Adam");

        // There is no order defined in the HashSet
        for(String name: set) {
            System.out.println(name);
        }

        Set<String> set2 = new HashSet<>();

        set2.add("Adam");
        set2.add("Ana");

        set.retainAll(set2);

        System.out.println("Elements retained:");
        for(String name: set) {
            System.out.println(name);
        }

        set.remove("Adam");
        System.out.println("Elements after removing:");
        for(String name: set) {
            System.out.println(name);
        }

    }

}
