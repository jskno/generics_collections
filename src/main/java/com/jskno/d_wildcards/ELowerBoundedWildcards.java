package com.jskno.d_wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ELowerBoundedWildcards {

    public static void main(String[] args) {

        List<? super Integer> list1 = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        List<? super Integer> list3 = new ArrayList<Object>();

        // How to read items using lower bounded wildcard
//        showAll(list1);
//        showAll(list2);
//        showAll(list3);

        // Number implements the Serializable interface, so Serializable is a superclass of Number
        List<Serializable> list4 = new ArrayList<>();
        list4.add("Adam");
        list4.add("Jose");
        list4.add("Andres");
        showAll(list4);

        // How to insert items
        List<? super Number> list5 = new ArrayList<>();
        list5.add(6);
        list5.add(6.35);
        list5.add(25.56f);
        showAll(list5);



    }

    public static void showAll(List<? super Number> list) {
        list.forEach(System.out::println);
    }

    public static void showAll2(List<? super Number> list) {
        // What showAll is really doing is:
        for(Object each: list) {
            System.out.println(each);
        }
    }

}
