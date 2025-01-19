package com.jskno.k_sorting_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_SortingCollectionsApp {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Adam");
        list.add("Joe");
        list.add("Katy");
        list.add("Ana");
        list.add("Elisabeth");

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
