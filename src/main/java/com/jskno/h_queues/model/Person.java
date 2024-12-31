package com.jskno.h_queues.model;

public record Person(String name, int age) implements Comparable<Person> {

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
}
