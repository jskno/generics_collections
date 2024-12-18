package com.jskno.d_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUpperBoundedWildcards {

    public static void main(String[] args) {

        List<? extends Number> numberList = new ArrayList<>();

        // Compilation error
//        numberList.add(3);
//        numberList.add(new Integer(23));

        List<? extends Number> numberList2 = new ArrayList<Integer>();
        //numberList2.addAll(Arrays.asList(1, 2, 3));  --> Compile error, only reading available
        List<? extends Number> numberList3 = new ArrayList<Double>();
        List<? extends Number> numberList4 = new ArrayList<Float>();
        List<Integer> numberList5 = new ArrayList<>();

        // We use upper bounded wildcards to read items
        showAll(numberList2);
        showAll(numberList3);
        showAll(numberList4);
        showAll(numberList5);

        showAll(Arrays.asList(1, 2, 3));
        showAll(Arrays.asList(1.5, 2.8, 3.7));
        showAll(Arrays.asList(21.5f, 32.78f, 43.4f));

        System.out.println("The total sum is :" + sumAll(Arrays.asList(1.3, 5.8, 10.5)));


    }

    public static void showAll(List<? extends Number> list) {
        //list.add(new Integer(2)) Compile error
        list.forEach(System.out::println);
    }

    public static double sumAll(List<? extends Number> list) {
        return list.stream().map(Number::doubleValue).reduce(Double::sum).orElse(0.0);
    }



}
