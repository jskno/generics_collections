package com.jskno.l_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_CollectionsClassApp {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(10);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        // We can reverse the order
        Collections.reverse(nums);
        System.out.println(nums);

        // Min and Max
        System.out.println(Collections.min(nums));
        System.out.println(Collections.max(nums));

        Collections.shuffle(nums);
        System.out.println(nums);

        Collections.rotate(nums, 2);
        System.out.println(nums);

        nums.add(1);
        System.out.println(nums);
        Collections.replaceAll(nums, 1, 111);
        System.out.println(nums);

        // Pay attention to the method signature
        // public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        // Destination super, Source extends
        List<Integer> nums2 = new ArrayList<>();
        Collections.copy(nums, nums2);
        System.out.println(nums2);
    }
}
