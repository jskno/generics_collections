package com.jskno.a_basic_generics.d_generic_methods;

public class GenericMethod {

    public <T> void showItem(T item) {
        System.out.println("The item is: " + item);
    }

    public <T> T showAndReturn(T item) {
        System.out.println("The item is: " + item);
        return item;
    }


}
