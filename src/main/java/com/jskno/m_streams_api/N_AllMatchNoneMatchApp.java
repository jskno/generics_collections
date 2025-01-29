package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.List;

public class N_AllMatchNoneMatchApp {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        boolean result = books.stream()
                .allMatch(book -> book.getPages() > 2000);
        System.out.println(result);

        boolean result2 = books.stream()
                .noneMatch(book -> book.getPages() > 2000);
        System.out.println(result2);


        // In this case: short-circuiting, some operations don´t need to process the whole
        // stream to produce a result
        boolean result3 = books.stream()
                .noneMatch(book -> book.getPages() > 100);
        System.out.println(result3);

        books.stream()
                .filter(book -> book.getType() == Type.FICTION)
                .findAny()
                .ifPresent(System.out::println);

        books.stream()
                .filter(book -> book.getType() == Type.PHILOSOPHY)
                .findAny()
                .ifPresent(System.out::println);

        books.stream()
                .filter(book -> book.getType() == Type.PHILOSOPHY)
                .findFirst()
                .ifPresent(System.out::println);

        // findAny() returns arbitrary element
        // parallelization
        // findFirst() sequential
        // findAny() with parallelization
    }
}
