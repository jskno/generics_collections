package com.jskno.h_queues;

import com.jskno.h_queues.model.Person;
import com.jskno.h_queues.model.PersonByName;
import java.util.PriorityQueue;
import java.util.Queue;

public class B_PriorityQueue {

    /**
     *  Based on a priority heap !!!!
     *      We assign a priority value to every single item
     *
     *          - element with high priority queue is served before an element with low priority
     *          - the elements of the priority queue are ordered according to their natural ordering defined by the Comparable interface
     *
     *
     *    add() -> add elements to the queue
     *    peek() -> retrieves the head or this queue or null if the queue is empty (DOES NOT REMOVE)
     *    poll() -> retrieves and removes the head of this queue or null if the queue is empty
     *
     */

    public static void main(String[] args) {

        Queue<Person> queue = new PriorityQueue<>();

        queue.add(new Person("Kevin", 22));
        queue.add(new Person("Joe", 37));
        queue.add(new Person("Adam", 12));
        queue.add(new Person("Anna", 45));

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }

        Queue<PersonByName> queueByName = new PriorityQueue<>();

        queueByName.add(new PersonByName("Kevin", 22));
        queueByName.add(new PersonByName("Joe", 37));
        queueByName.add(new PersonByName("Adam", 12));
        queueByName.add(new PersonByName("Anna", 45));

        while (queueByName.peek() != null) {
            System.out.println(queueByName.poll());
        }

    }

}
