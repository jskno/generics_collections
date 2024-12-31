package com.jskno.h_queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class D_ArrayDequeAsStackApp {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        // We are retrieving the last items
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
