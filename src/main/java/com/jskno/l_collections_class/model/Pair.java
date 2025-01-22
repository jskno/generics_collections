package com.jskno.l_collections_class.model;

import java.util.Objects;

public class Pair {

    // let's store the URL and a data associated with the URL (for example the content of the website)
    // we store these Pair objects in the cache
    // YOUR IMPLEMENTATION HERE !!!

    private final String url;
    private final String content;


    public Pair(String url, String content) {
        this.url = url;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair pair = (Pair) o;
        return Objects.equals(url, pair.url);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(url);
    }

    @Override
    public String toString() {
        return "Pair{" +
            "url='" + url + '\'' +
            ", content='" + content + '\'' +
            '}';
    }

}
