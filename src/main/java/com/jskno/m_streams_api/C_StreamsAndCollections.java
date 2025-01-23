package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C_StreamsAndCollections {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        Stream<String> stream = names.stream();

        stream.forEach(System.out::println);
        try {
            stream.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
        names.stream().forEach(System.out::println);
    }

}
