package com.jskno.g_list;

import java.util.ArrayList;
import java.util.List;

public class B_Exercise {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        reverse(list);
        reverseCourseSolution(list);
    }

    /*
    Arrays coding exercise
    In this lecture, your exercise is to reverse a List<Integer> in-place (without extra memory) - by the way it is included in Java's Collections.

    For example:
        Input is [1, 2, 3, 4, 5, 6] --> result should be [6, 5, 4, 3, 2, 1] .
    There are multiple solutions (with quadratic running time as well as with linear running time complexity).
     */
    public static void reverse(List<Integer> list) {
        // here is your implementation
        System.out.println(list);

        int lastIndex = list.size() - 1;
        int swaps = list.size() / 2;
        for (int i = 0; i < swaps; i++) {
            Integer i1 = list.get(i);
            list.set(i, list.get(lastIndex - i));
            list.set(lastIndex - i, i1);
        }

        System.out.println(list);
    }

    public static void reverseCourseSolution(List<Integer> list) {
        for(int i = 0, mid=list.size() / 2, j=list.size() - 1; i < mid; i++, j--) {
            int num1 = list.get(i);
            int num2 = list.get(j);
            list.set(i, num2);
            list.set(j, num1);
        }
    }

}
