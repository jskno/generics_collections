package com.jskno.m_streams_api;

import java.util.Comparator;
import java.util.stream.Stream;

public class B_StreamsWithStrings {

    public static void main(String[] args) {

        String[] names = {"Adam", "Daniel", "Martha", "Kevin", "Ben", "Joe", "Brad", "Susan"};

        System.out.println("Printing names: ");
        Stream.of(names).forEach(System.out::println);

        System.out.println("Descending order by");
        Stream.of(names)
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);

        System.out.println("Filtering names");
        Stream.of(names)
            .filter(name -> name.startsWith("A"))
            .sorted()
            .forEach(System.out::println);
    }

}
