package com.jskno.j_sets;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class D_TreeSetWithSubsetApp {

    public static void main(String[] args) {

        // O(logN) because the underlying data structure is a red-black tree.
        // It needs less memory than HashSet and LinkedHashSet
        SortedSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(120);
        set.add(87);
        set.add(55);

        System.out.println("Printing a the whole set");
        for (Integer num: set) {
            System.out.println(num);
        }

        Set<Integer> subSet = set.subSet(0, 80);

        System.out.println("Printing a subset of the set");
        for (Integer num: subSet) {
            System.out.println(num);
        }

        Set<Integer> tailSet = set.tailSet(6);

        System.out.println("Printing a tailed set of the set");
        for (Integer num: tailSet) {
            System.out.println(num);
        }

        Set<Integer> headSet = set.headSet(20);

        System.out.println("Printing a headSet of the set");
        for (Integer num: headSet) {
            System.out.println(num);
        }

        System.out.println(set.first());
        System.out.println(set.last());

        // Reverse set
        SortedSet<Integer> reversSet = new TreeSet<>(Comparator.reverseOrder());

        reversSet.add(12);
        reversSet.add(1);
        reversSet.add(9);
        reversSet.add(5);
        reversSet.add(120);
        reversSet.add(87);
        reversSet.add(55);

        System.out.println("Printing a reversSet");
        for (Integer num: reversSet) {
            System.out.println(num);
        }

        System.out.println(reversSet.first());
        System.out.println(reversSet.last());
    }

}
