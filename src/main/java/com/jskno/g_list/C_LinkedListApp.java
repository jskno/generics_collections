package com.jskno.g_list;

import java.util.LinkedList;
import java.util.List;

public class C_LinkedListApp {

    // WE USE LINKEDLIST IMPL WHEN WE NEED TO MANIPULATE THE FIRST AND THE LAST ITEM OF THE LIST
    // IT REQUIRES MORE MEMORY THAT ARRAY LIST
    // WE USE ARRAYLIST IMPL WHEN WE NEED TO MANIPULATE JUST THE LAST ITEM EFFICIENTLY
    public static void main(String[] args) {

        // Bear in mind that the LinkedList is a double link implementation of List
        // Which means each node in the list contains a pointer to the previous node and a pointer to the next node
        List<Integer> list = new LinkedList<>();

        // We can manipulate the first and last item with O(1) complexity
        // because it is a Double LinkedList implementation
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(3);

        // We can manipulate the first and last item with O(1) complexity
        list.addLast(20);
        list.addFirst(30);

        list.remove(3);

        // We can manipulate the first and last item with O(1) complexity
        list.removeFirst();
        list.removeLast();

        System.out.println("Is Empty: " + list.isEmpty());
        System.out.println("Size: " + list.size());

        for (Integer each : list) {
            System.out.println(each);
        }
    }
}
