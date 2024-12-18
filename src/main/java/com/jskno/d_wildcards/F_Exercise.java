package com.jskno.d_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class F_Exercise {

    public static void main(String[] args) {
        List<Double> source = List.of(5.50, 8.87, 10.3);
        List<Double> destination = new ArrayList<>();

        System.out.println(destination);
        copy(source, destination);
        System.out.println(destination);

        // Have a look at the Java collection implementation
        Collections.copy(new ArrayList<>(), new ArrayList<>());

        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 5, 2));
        System.out.println(myList);
        modifyInputList(myList);
        System.out.println(myList);
    }

    // your generic copy algorithm method here
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> void copy2(List<? extends T> source, List<? super T> destination) {
        for (T t: source) {
            destination.add(t);
        }
    }

    // UPPER BOUNDED NOT PROVIDED IMMUTABILITY
    public static <T extends Comparable<T>> void modifyInputList(List<? extends T> myListCanBeModified) {
        myListCanBeModified.sort(Comparable::compareTo);
        myListCanBeModified.add(null);
    }

}
