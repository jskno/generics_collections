package com.jskno.l_collections_class;

import java.util.ArrayList;
import java.util.List;

public class C_SynchronizedCollectionsProblem {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

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
