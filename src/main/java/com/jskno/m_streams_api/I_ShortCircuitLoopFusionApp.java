package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class I_ShortCircuitLoopFusionApp {

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

        // finding 2 longest books (with more than 500 pages)
        // short-circuiting and loop fusion
        // filter() and map() are different operations, they
        // are merged into the same pass (loop fusion)
        // short-circuiting: some operations don´t need to process the whole
        // stream to produce a result, here we are looking for just 2 items - so
        // the algorithm terminates after finding 2 items
        System.out.println("First streams process:");
        System.out.println();
        List<String> longestBooks = books.stream()
                .filter(b -> {
                    System.out.println("Filtering " + b.getTitle() + " pages:" + b.getPages());
                    return b.getPages() > 500;
                })
                .map(b -> {
                    System.out.println("Mapping " + b.getTitle() + " pages:" + b.getPages());
                    return b.getTitle();
                })
                .limit(2)
                .toList();
        System.out.println();
        System.out.println(longestBooks);

        System.out.println("Second streams process:");
        System.out.println();
        List<String> longestBooks2 = books.stream()
                .filter(b -> {
                    System.out.println("Filtering " + b.getTitle() + " pages:" + b.getPages());
                    return b.getPages() > 500;
                })
                .sorted((b1, b2) -> {
                    System.out.println("Sorting b1: " + b1.getTitle() + "-" + b1.getPages() + " b2: " + b2.getTitle() + "-" + b2.getPages());
                    return b1.getPages() - b2.getPages();
                })
                .map(b -> {
                    System.out.println("Mapping " + b.getTitle() + " pages:" + b.getPages());
                    return b.getTitle();
                })
                .limit(2)
                .toList();

        System.out.println();
        System.out.println(longestBooks2);

    }
}
