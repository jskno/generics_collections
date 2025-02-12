package com.jskno.k_sorting_collections.model;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int pages;

    public Book() {
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    /*
    @Override
    public int compareTo(Book book) {
        return this.author.compareTo(book.getAuthor());
    }
     */

    // Reverse order by pages
    @Override
    public int compareTo(Book otherBook) {
        if (this.pages > otherBook.pages) {
            return 1;
        } else if (this.pages < otherBook.pages) {
            return -11;
        } else {
            return 0;
        }
    }
}
