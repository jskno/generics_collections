package com.jskno.m_streams_api;

import java.util.stream.IntStream;

public class P_ParallelizationExample2App {

    public static void main(String[] args) {

        // sequential stream
        long start = System.currentTimeMillis();
        long numberOfPrimes = IntStream.range(2, Integer.MAX_VALUE / 100)
                .filter(P_ParallelizationExample2App::isPrime)
                .count();
        System.out.println("Number of primes: " + numberOfPrimes);
        System.out.println("TIme taken sequential: " + (System.currentTimeMillis() - start));


        // parallel stream
        start = System.currentTimeMillis();
        numberOfPrimes = IntStream.range(2, Integer.MAX_VALUE / 100)
                .parallel()
                .filter(P_ParallelizationExample2App::isPrime)
                .count();
        System.out.println("Number of primes: " + numberOfPrimes);
        System.out.println("TIme taken paralle: " + (System.currentTimeMillis() - start));
    }

    private static boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num % 2 == 0) return true;

        // We can check the numbers in the range [0, sqrt(n)]
        long maxDivisor = (long) Math.sqrt(num);
        // 3 5 7 9 11
        for (int i = 3; i <= maxDivisor; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
