package com.jskno.m_streams_api;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J_MapAndFlatMapApp {

    public static void main(String[] args) {

        // we have the dataset
        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        // map() and flatMap() are similar to selecting a column is SQL
        // number of characters in every word
        List<String> words = Arrays.asList("Adam", "Ana", "Daniel");
        // [4, 5, 6]
        List<Integer> wordsLength = words.stream()
                .map(String::length)
                .toList();
        wordsLength.forEach(System.out::println);

        // create a list containing the squared values
        // [1, 4, 9, 16,...]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        squares.forEach(System.out::println);

        // flatMap
        // "hello" "shell" --> get all unique characters --> (h, e, l, o, s)
        String[] array = {"hello", "shell"};
        List<String[]> uniqueBadly = Arrays.stream(array)
                .map(w -> w.split(""))
                .distinct()
                .toList();
        uniqueBadly.forEach(strings -> System.out.println(Arrays.toString(strings)));
        uniqueBadly.forEach(strings -> Arrays.stream(strings).forEach(System.out::println));

        List<String> unique = Arrays.stream(array)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        System.out.println(unique);

    }
}
