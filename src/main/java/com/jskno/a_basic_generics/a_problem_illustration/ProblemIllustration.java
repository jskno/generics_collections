package com.jskno.a_basic_generics.a_problem_illustration;

public class ProblemIllustration {

    public static void main(String[] args) {
        add(10, 28);
        // This is not going to compile unless we create overloading method for double
        add(10.50, 28.57);
    }

    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result is " + result);
    }

    // METHOD OVERLOADING
    private static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result is " + result);
    }

}
