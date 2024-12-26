package com.jskno.f_collections_intro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ACollectionsOverview {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");
        names.add("Bob");

        printNamesIterator(names);
        printNames(names);


    }

    private static void printNamesIterator(List<String> names) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
