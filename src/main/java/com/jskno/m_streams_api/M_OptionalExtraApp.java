package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class M_OptionalExtraApp {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Being and Time", "Heidegger", 560, Type.PHILOSOPHY));
        books.add(new Book("The Trial", "Franz Kafka", 240, Type.NOVEL));
        books.add(new Book("Death on The Nile", "Agatha Christie", 370, Type.THRILLER));
        books.add(new Book("Ancient Greece", "Robert F.", 435, Type.HISTORY));
        books.add(new Book("Ancient Rome", "Robert F.", 860, Type.HISTORY));
        books.add(new Book("Death of Virgil", "Hermann Broch", 590, Type.NOVEL));
        books.add(new Book("The Stranger", "Albert Camus", 560, Type.NOVEL));

        OptionalInt maxPages = books.stream()
                .mapToInt(Book::getPages)
                .max();
        System.out.println(maxPages.orElse(0));
        maxPages.ifPresent(System.out::println);
    }
}
