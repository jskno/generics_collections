package com.jskno.d_wildcards;

import java.util.Arrays;
import java.util.List;

public class BWildCardsExamples {

    public static void main(String[] args) {

        Integer i = 32;
        print(i);

        List<Integer> nums = Arrays.asList(1, 2, 3);
//        printList(nums);

        // So Integer is a subtype of Object
        // But List<Integer> is not a subtype of List<Object>

        List<String> names = Arrays.asList("Jose", "Alvaro");
        printWild(nums);
        printWild(names);

    }

    public static void print(Object o) {
        System.out.println(o.toString());
    }

    public static void printList(List<Object> list) {
        list.forEach(System.out::println);
    }

    // UNBOUNDED WILDCARDS
    public static void printWild(List<?> list) {
        list.forEach(System.out::println);
    }

}
