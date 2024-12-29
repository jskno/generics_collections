package com.jskno.g_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class D0_ArrayListVsLinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        long now = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            array.addFirst(i);
        }

        System.out.println("Time taken for ArrayList: " + (System.currentTimeMillis() - now));

        LinkedList<Integer> linkedList = new LinkedList<>();

        now = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            linkedList.addFirst(i);
        }

        System.out.println("Time taken for LinkedList: " + (System.currentTimeMillis() - now));
    }
}
