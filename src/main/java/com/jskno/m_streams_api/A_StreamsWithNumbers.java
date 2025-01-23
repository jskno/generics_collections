package com.jskno.m_streams_api;

import java.util.Arrays;
import java.util.stream.IntStream;

public class A_StreamsWithNumbers {

    public static void main(String[] args) {

        // Declarative way
        int[] nums = {1, 5, 3, -2, 9, 12};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println(nums[i]);
        }
        System.out.println("Total Sum: " + sum);

        // Using streams
        Arrays.stream(nums).forEach(System.out::println); // :: operator or method reference
        int streamSum = Arrays.stream(nums).sum();
        System.out.println("Total Sum: " + streamSum);

        IntStream.range(0, 5).forEach(System.out::println);
        IntStream.range(0, 5).forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream.range(0, 25)
            .filter(num -> num % 2 == 0)
            .forEach(x -> System.out.print(x + " "));

    }

}
