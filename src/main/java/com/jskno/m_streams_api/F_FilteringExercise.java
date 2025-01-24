package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class F_FilteringExercise {

    /*
    Your task is to select all the book where the title is made up of exactly 2 words.

    So the result should be:

    Book [title=The Trial, author=Franz Kafka, pages=240, type=NOVEL]
    Book [title=Ancient Greece, author=Robert F., pages=435, type=HISTORY]
    Book [title=Ancient Rome, author=Robert F., pages=860, type=HISTORY]
    Book [title=The Stranger, author=Albert Camus, pages=560, type=NOVEL]
     */
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

        // here you have to filter these books - and return the result
        List<Book> twoWordsTitleBooks = books.stream()
            .filter(b -> b.getTitle().split(" ").length == 2)
            .toList();
        twoWordsTitleBooks.forEach(System.out::println);

    }

}

class Book {

    private String author;
    private String title;
    private int pages;
    private Type type;

    public Book(String title, String author, int pages, Type type) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", pages=" + pages + ", type=" + type + "]";
    }
}

enum Type {
    NOVEL, FICTION, HISTORY, THRILLER, PHILOSOPHY;
}
