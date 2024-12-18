package com.jskno.d_wildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class G_WildcardsVsGenericBounded {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 5, 2, 3);
        List<Double> doubles = List.of(1.5, 5.5, 2.5, 3.5);

        printSumAndGreater(integers);
        printSumAndGreater(doubles);

        // 1.
        // We can use wildcards wherever we want, for example in the MAIN method
        // as well as in a method parameters (printList)
        // T as generic only in methods
        List<? super Comparable<?>> myComparableList = new ArrayList<>();
        myComparableList.add("A");
        myComparableList.add("Z");
        myComparableList.add("B");
        printList(myComparableList);
        Stream<? super Comparable<?>> sorted = myComparableList.stream().sorted();
        System.out.println(sorted);

    }

    // 2. Bounded type parameters can handle multiple bounds
    public static <T extends Number & Comparable<T>> void printSumAndGreater(List<T> myList) {
        T greater = myList.getFirst();
        double total = 0;
        for (int i = 1; i < myList.size(); i++) {
            total += myList.get(i).doubleValue();
            if (greater.compareTo(myList.get(i)) < 0) {
                greater = myList.get(i);
            }
        }
        System.out.println("Greater element: " + greater);
        System.out.println("Total sum: " + total);
    }

    public static void printList(List<?> myList) {
        myList.forEach(System.out::println);
    }

}
