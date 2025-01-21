package com.jskno.l_collections_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D_SynchronizedCollectionsSolution {

    public static void main(String[] args) {

        // Add and Remove methods are synchronized
        // Intrinsic lock --> Not efficient because because threads
        // have to wait for each other even when they want to execute
        // independent methods (operations)
        // The efficient solution CONCURRENT COLLECTIONS !!!
        List<Integer> nums = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1_000; i++) {
                    nums.add(i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000; i++) {
                nums.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Size of nums: " + nums.size());
    }
}
