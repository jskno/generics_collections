package com.jskno.m_streams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class K_MappingExerciseApp {

    public static void main(String[] args) {
        System.out.println(generatePairs());
    }

    /*
    Your task is that given two lists of numbers ([1, 2, 3], [4, 5]).
    Generate all pairs of possible numbers!

    So the result in the case should be: (1,4), (1,5), (2,4),(2,5),(3,4),(3,5)

     */
    public static List<List<Integer>> generatePairs() {

        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);

        List<List<Integer>> pairs = nums1.stream()
                .flatMap(i -> nums2.stream().map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());

        // implement your algorithm here (the pairs will be the result)
        /*
        nums1.stream().map(n1 -> {
                    List<Integer> list = new ArrayList<>();
                    nums2.stream().map(n2 -> {
                        list.add(n1);
                        list.add(n2);
                        return list;
                    });
            return ;
        });

         */

        return pairs;
    }
}
