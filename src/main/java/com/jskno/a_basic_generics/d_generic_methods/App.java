package com.jskno.a_basic_generics.d_generic_methods;

public class App {


    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.showItem("Hello World!!!");
        genericMethod.showItem(34);
        genericMethod.showItem(0.333);

        System.out.println("Item is returned: " + genericMethod.showAndReturn("Hello World!!!"));
        System.out.println("Item is returned: " + genericMethod.showAndReturn(34));
        System.out.println("Item is returned: " + genericMethod.showAndReturn(0.333));

    }

}
