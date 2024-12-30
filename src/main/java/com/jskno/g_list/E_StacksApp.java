package com.jskno.g_list;

import java.util.Stack;

// NOTE:
// In the previous lesson has been stated that Vector is a not used class because
// it is synchronized and the lock is acquired for every operation. Making it a very slow data structure
// Bear in mind that this Stack java class extends Vector

// We have considered Vectors - and we came to the conclusion that ArrayList is a better option usually.
// Stack extends the Vector class - which means that stacks are inherently synchronized.
// However, synchronization is not always needed - in such cases it is better to use ArrayDeque
public class E_StacksApp {

    // Stack are crucial in graph algorithms such as
    // -DeepFirstSearch,
    // - when finding strongly connected components
    // - shortest path approaches, like Dijkstra algorithm
    public static void main(String[] args) {

        Stack<String> names = new Stack<>();
        names.push("Adam");
        names.push("Joe");
        names.push("Ana");
        names.push("Daniel");
        names.push("Kate");

        System.out.println(names.size());
        System.out.println(names.peek());
        System.out.println(names.size());

        System.out.println(names.pop());
        System.out.println(names.size());

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }

}
