package com.jskno.l_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_UnmodifiableCollections {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);
        // Passing by reference (vs passing by value)
        // The list will be modified
        modify(nums);
        System.out.println(nums);

        List<Integer> nums2 = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums2 = Collections.unmodifiableList(nums2);

        System.out.println(nums2);
        // UnsupportedOperationException
        modify(nums2);
        System.out.println(nums2);
    }

    private static void modify(List<Integer> list) {
        list.remove(0);
    }

}
