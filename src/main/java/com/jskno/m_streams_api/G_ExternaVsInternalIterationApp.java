package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class G_ExternaVsInternalIterationApp {

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

        // External iteration (collections)
        List<String> titles = new ArrayList<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        System.out.println(titles);

        // External iteration under the hood:
        // inherently sequential approach because we are getting the items one by one
        // 1. no optimization (maybe item2 is in memory location next to item4, but they are not going to be retrieved together
        // 2. no parallelization
        List<String> authors = new ArrayList<>();
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            authors.add(book.getAuthor());
        }
        System.out.println(authors);

        // Stream API - Internal iteration
        // 1. The tiles that are locating one next each other in memory location are going to be handle right after each other because it's going to be faster
        // 2. We can achieve parallelization easily
        List<String> titlesInternalIteration = books.stream()
                .map(Book::getTitle)
                .toList();
        titlesInternalIteration.forEach(System.out::println);




    }
}
