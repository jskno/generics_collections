package com.jskno.m_streams_api;

import com.jskno.m_streams_api.model.Book;
import com.jskno.m_streams_api.model.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E_StreamsCustomObject_2 {

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

        // Grouping by type
        Map<Type, List<Book>> booksByType = books.stream().collect(Collectors.groupingBy(Book::getType));
        booksByType.entrySet().forEach(System.out::println);

        System.out.println();
        System.out.println("Largest books:");
        // Finding 2 longest books (number of pages)
        List<String> longestBooks = books.stream()
            .filter(b -> b.getPages() > 500)
            .map(Book::getTitle)
            .limit(2)
            .toList();
        longestBooks.forEach(System.out::println);



    }

}
