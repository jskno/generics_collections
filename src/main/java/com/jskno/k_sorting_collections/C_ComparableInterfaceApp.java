package com.jskno.k_sorting_collections;

import com.jskno.k_sorting_collections.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C_ComparableInterfaceApp {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();

        books.add(new Book("Comedia", "Dante Alighieri", 875));
        books.add(new Book("La peste", "Albert Camus", 125));
        books.add(new Book("Hamlet", "William Shakespeare", 89));
        books.add(new Book("El Quijote", "Miguel De Cervantes", 1200));

        Collections.sort(books);
        System.out.println(books);

        Collections.sort(books, Comparator.comparing(Book::getTitle).reversed());
        System.out.println(books);

        Collections.sort(books, Comparator.comparing(Book::getPages));
        System.out.println(books);

    }
}
