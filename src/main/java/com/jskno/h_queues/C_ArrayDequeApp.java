package com.jskno.h_queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class C_ArrayDequeApp {

    public static void main(String[] args) {

        // Double ended Queue (DEQUE)
        // Huge one dimensional arrays - O(1)

        // FIFO
        Queue<Integer> queue0 = new ArrayDeque<>();

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);

        // We are retrieving the first items
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}
