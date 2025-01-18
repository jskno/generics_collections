package com.jskno.j_sets;

import java.util.Set;
import java.util.TreeSet;

public class C_TreeSetApp {

    public static void main(String[] args) {

        // O(logN)
        Set<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);

        for (Integer num: set) {
            System.out.println(num);
        }
    }

}
