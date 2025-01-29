package com.jskno.m_streams_api;

import com.jskno.m_streams_api.model.Book;
import com.jskno.m_streams_api.model.Type;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class I_OptionalsAndConceptsApp {

    public static void main(String[] args) throws IOException {


        List<Book> books = new ArrayList<>();

        books.add(new com.jskno.m_streams_api.model.Book("Heidegger", "Being and Time", 560, com.jskno.m_streams_api.model.Type.PHILOSOPHY));
        books.add(new com.jskno.m_streams_api.model.Book("Franz Kafka", "Transformation", 240, com.jskno.m_streams_api.model.Type.NOVEL));
        books.add(new com.jskno.m_streams_api.model.Book("Agatha Christie", "Death on The Nile", 370, com.jskno.m_streams_api.model.Type.NOVEL));
        books.add(new com.jskno.m_streams_api.model.Book("Robert F.", "Ancient Greece", 435, com.jskno.m_streams_api.model.Type.HISTORY));
        books.add(new com.jskno.m_streams_api.model.Book("Robert F.", "Ancient Rome", 860, com.jskno.m_streams_api.model.Type.HISTORY));
        books.add(new com.jskno.m_streams_api.model.Book("Hermann Broch", "Death of Virgil", 590, com.jskno.m_streams_api.model.Type.NOVEL));
        books.add(new com.jskno.m_streams_api.model.Book("Franz Kafka", "The Trial", 240, com.jskno.m_streams_api.model.Type.NOVEL));
        books.add(new Book("Albert Camus", "The Stranger", 560, Type.NOVEL));

        System.out.println("Number of books:");
        System.out.println(books.stream().count());
        System.out.println("Number of books:");
        System.out.println((long) books.size());

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> emptyNums = new ArrayList<>();
        List<Integer> nullNums = null;

        // We don't want to get a NullPointerException
        Optional<Integer> result = nums.stream().reduce(Integer::max);
        Optional<Integer> emptyResult = emptyNums.stream().reduce(Integer::max);
        Optional<Integer> nullResult = Optional.ofNullable(nullNums).orElse(List.of()).stream().reduce(Integer::max);

        System.out.println("Max of nums:");
        result.ifPresent(System.out::println);
        System.out.println("Max of empty nums:");
        emptyResult.ifPresent(System.out::println);
        System.out.println("Max of null nums:");
        nullResult.ifPresent(System.out::println);

        System.out.println("Max of nums:");
        nums.stream().reduce(Integer::max).ifPresent(System.out::println);

        // Get the maximum number of pages
        System.out.println("Maximum number of pages:");
        books.stream().map(Book::getPages).reduce(Integer::max).ifPresent(System.out::println);
        books.stream().mapToInt(Book::getPages).max().ifPresent(System.out::println);

        // Get the longest book
        System.out.println("Longest book:");
        books.stream().reduce((b1, b2) -> b1.getPages() > b2.getPages() ? b1 : b2).ifPresent(System.out::println);
        books.stream().map(Book::getPages).reduce(Integer::max).ifPresent(System.out::println);

        // Sum all pages of all books
        // We have to transform Stream<Integer> into an integer stream "list of integers"
            //int totalPages = books.stream().map(Book::getPages).sum();
        System.out.println("Sum of pages:");
        int totalPages = books.stream().mapToInt(Book::getPages).sum();
        System.out.println(totalPages);

        // Or
        Stream<Integer> integerStream = books.stream().map(Book::getPages);
        IntStream intStream = books.stream().mapToInt(Book::getPages);
        Stream<Integer> boxed = intStream.boxed();

        int countingElements = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).mapToInt(i -> 1).sum();
        System.out.println("Counting elements:");
        System.out.println(countingElements);

    }
}
