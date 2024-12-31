package com.jskno.h_queues;

import java.util.LinkedList;
import java.util.Queue;

public class A_QueueApp {

    public static void main(String[] args) {

        // Look at the 2_CollectionsFramework.png to understand
        Queue<String> queue = new LinkedList<>();

        // FIFO - O(1)
        queue.add("Adam");
        queue.add("Kevin");
        queue.add("Ana");
        queue.add("Kate");

        System.out.println("Removing: " + queue.remove());
        System.out.println("Checking: " + queue.element());

        System.out.println("Printing whole list:");
        for (String item: queue) {
            System.out.println(item);
        }

        System.out.println("While not empty iteration:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
