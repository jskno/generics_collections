package com.jskno.c_type_inference;

import java.util.ArrayList;

public class CFromNotes {

    public static void main(String[] args) {
        System.out.println(getData("Hello World", new ArrayList<>()));
        getData("Hello World", new ArrayList<>());
    }

    public static <T> T getData(T t1, T t2) {
        System.out.println(t1.getClass());
        System.out.println(t2.getClass());
        return t1;
    }

}
