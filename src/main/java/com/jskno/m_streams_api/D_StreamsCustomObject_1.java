package com.jskno.m_streams_api;

import com.jskno.m_streams_api.model.Book;
import com.jskno.m_streams_api.model.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class D_StreamsCustomObject_1 {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Heidegger", "Being and Time", 560, Type.PHILOSOPHY));
        books.add(new Book("Franz Kafka", "Transformation", 240, Type.NOVEL));
        books.add(new Book("Agatha Christie", "Death on The Nile", 370, Type.NOVEL));
        books.add(new Book("Robert F.", "Ancient Greece", 435, Type.HISTORY));
        books.add(new Book("Robert F.", "Ancient Rome", 860, Type.HISTORY));
        books.add(new Book("Hermann Broch", "Death of Virgil", 590, Type.NOVEL));
        books.add(new Book("Franz Kafka", "The Trial", 240, Type.NOVEL));
        books.add(new Book("Albert Camus", "The Stranger", 560, Type.NOVEL));

        books.forEach(System.out::println);

        List<Book> novels = books.stream()
            .filter(book -> book.getType() == Type.NOVEL)
            .toList();

        System.out.println();
        System.out.println("Novels:");
        novels.forEach(System.out::println);

        List<Book> sortedNovels = novels.stream()
            .sorted(Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle))
            .toList();

        System.out.println();
        System.out.println("Sorted Novels:");
        sortedNovels.forEach(System.out::println);

        List<String> novelTitles = books.stream()
            .filter(book -> book.getType() == Type.NOVEL)
            .sorted(Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle))
            .map(Book::getTitle)
            .toList();

        System.out.println();
        System.out.println("Novel Titles:");
        novelTitles.forEach(System.out::println);

    }

}
