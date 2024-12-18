package com.jskno.c_type_inference;

import java.util.ArrayList;
import java.util.List;

public class BTypeInferenceExample {

    public static void main(String[] args) {

        // How Java knows that this new ArrayList<>() is going to store Integers
        // Because of type inference at the destination method args
        // It observes item1 and item2 are Integers, so the ArrayList must be of Integers
        List<Integer> list1 = add(new ArrayList<>(), 20, 30);
        System.out.println(list1);

        // Compilation error
//        List<String> list2 = add(new ArrayList<>(), 20, 30);
//        System.out.println(list2);

        // Just works fine
        List<String> list3 = add(new ArrayList<>(), "Kevin", "Adam");
        System.out.println(list3);
    }

    static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }

}
