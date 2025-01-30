package com.jskno.m_streams_api;

import java.util.stream.LongStream;

public class O_ParallelizationExample1App {

    public static void main(String[] args) {

        // parallel() - because we have to make sure that the given
        // stream can be parallelized.
        // under the hood the fork-join framework is used
        long now = System.currentTimeMillis();
        System.out.println(sum(1_000_000_000));
        System.out.println("Elapsed time sequential: " + (System.currentTimeMillis() - now));

        now = System.currentTimeMillis();
        System.out.println(parallelSum(1_000_000_000));
        System.out.println("Elapsed time parallel: " + (System.currentTimeMillis() - now));

    }

    private static long sum(long n) {
        return LongStream.rangeClosed(1, n).reduce(0L, Long::sum);

    }

    private static long parallelSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
    }
}
