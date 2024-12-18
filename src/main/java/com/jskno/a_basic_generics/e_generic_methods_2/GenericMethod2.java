package com.jskno.a_basic_generics.e_generic_methods_2;

public class GenericMethod2 {

    public <T, V> void printItems(T t, V v) {
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    public <T> void showItems(T[] items) {
        for(T item: items) {
            System.out.println(item);
        }
    }

}
