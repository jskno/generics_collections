package com.jskno.k_sorting_collections;

import com.jskno.k_sorting_collections.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class E_SortingWithLambdasApp {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Adam", 36));
        people.add(new Person("Joe", 86));
        people.add(new Person("Michael", 12));
        people.add(new Person("Adam", 15));
        people.add(new Person("Ana", 26));
        people.add(new Person("Katy", 66));
        people.add(new Person("Kevin", 57));

        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, Comparator.comparing(Person::getName).reversed());

        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, Comparator
                .comparing(Person::getName)
                .thenComparing(Person::getAge)
                .reversed());

        for (Person person : people) {
            System.out.println(person);
        }


    }
}
