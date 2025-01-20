package com.jskno.k_sorting_collections.model;

import java.util.Comparator;

public class BookComparatorByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
