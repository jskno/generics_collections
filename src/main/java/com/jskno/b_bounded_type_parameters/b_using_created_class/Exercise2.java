package com.jskno.b_bounded_type_parameters.b_using_created_class;

public class Exercise2 {

    public static void main(String[] args) {
        Double[] doubles = {2.54, 3.458, 10.55, -5.415, 56.0, 63.1};
        System.out.println(countGreaterItems(doubles, 10.5));

        Character[] characters = {'a', 'f', 'r', 't', 'e'};
        System.out.println(countGreaterItems(characters, 'e'));

    }

    public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
        int counter = 0;
        for(T each: items) {
            if (each.compareTo(item) > 0) {
                counter++;
            }
        }

        return counter;
    }
}
