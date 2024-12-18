package com.jskno.b_bounded_type_parameters.a_presentation;

public class App {

    public static void main(String[] args) {
        System.out.println(calculateMin(32, 54));
        System.out.println(calculateMin("f", "a"));
        System.out.println(calculateMin("Kevin", "Ana"));
    }

    /*
    As it is it will not compile because the type T is generic and does not implement a method to compare two T objects
    public static <T> T calculateMin(T num1, T num2) {
        if (num1 < num2)
    }

     */

    // Comparable is an interface that uses Generic, that the reason we add <> after Comparable
    // Not related directly with the example as we will see later
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0) {
            return num1;
        }
        return num2;
    }

}
