package com.jskno.h_queues.model;

public record PersonByName(String name, int age) implements Comparable<PersonByName> {

    @Override
    public int compareTo(PersonByName otherPerson) {
        return -this.name.compareTo(otherPerson.name);
    }
}
