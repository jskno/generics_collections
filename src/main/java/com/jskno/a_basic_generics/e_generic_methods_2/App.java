package com.jskno.a_basic_generics.e_generic_methods_2;

import java.util.List;

public class App {

    public static void main(String[] args) {

        GenericMethod2 genericMethod2 = new GenericMethod2();
        genericMethod2.printItems("Adam", 3);
        genericMethod2.printItems(45.58, List.of("1", "Adiós"));

        // COMPILE ERROR WITH PRIMITIVES
//        int[] primitives = {1, 2, 3, 4, 5, 6};
//        genericMethod2.showItems(primitives);

        Integer[] wrapper = {1, 2, 3, 4, 5, 6};
        genericMethod2.showItems(wrapper);

        String[] wrapperString = {"Adam", "Ana", "Daniel", "Kevin", "Michael"};
        genericMethod2.showItems(wrapperString);
    }

}
