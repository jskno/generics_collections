package com.jskno.a_basic_generics.e_generic_methods_2;

public class Exercise {

    public static void main(String[] args) {

        System.out.println(checkEquality(12, 8));               // returns false
        System.out.println(checkEquality(10.5, 10.5));          // returns true
        System.out.println(checkEquality("Jose", "Jose"));      // returns true
    }

    public static <T> boolean checkEquality(T item1, T item2) {
        return item1.equals(item2);
    }

}
