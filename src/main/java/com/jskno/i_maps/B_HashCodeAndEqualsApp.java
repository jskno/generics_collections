package com.jskno.i_maps;

import com.jskno.i_maps.model.Person;
import java.util.HashMap;
import java.util.Map;

public class B_HashCodeAndEqualsApp {

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        // It will use Person hashCode function to determine the bucket
        map.put(new Person("Adam", 35), "Director");

        Map<String, Person> map2 = new HashMap<>();
        // It will use the String hashCode function
        map2.put("Adam", new Person("Adam", 35));

        // The equals method will be used for two things:
        // - compare two person to avoid repeting same key in a map.
        // - when there is collision and two items are in the same bucket in a LinkedList, it has to compare every element to find the one we are looking for.
        map.put(new Person("Adam", 35), "Manager");

        for (Map.Entry<Person, String> keyMap: map.entrySet()) {
            System.out.println(keyMap.getKey() + "---" + keyMap.getValue());
        }

    }

}
