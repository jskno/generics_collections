package com.jskno.k_sorting_collections;

import java.util.Arrays;

public class A_SortingArraysApp {

    public static void main(String[] args) {

        // QuickSort - to sort primitive types (int, float, etc.)
        // MargeSort - to sort reference types (Integer, String, etc.)

        int[] nums = { 1, 10, 5, 2, -5, 12, 14, 0, 1, 2 };

        Arrays.sort(nums);

        System.out.println("Printing ascending order");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Printing ascending order");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        String[] names = { "Kevin", "Adam", "Ans", "John", "Jane", "Jack" };

        Arrays.sort(names);

        System.out.println("Printing ascending order");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
