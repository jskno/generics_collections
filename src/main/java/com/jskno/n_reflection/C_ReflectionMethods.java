package com.jskno.n_reflection;

import com.jskno.n_reflection.model.PublicPerson;
import java.lang.reflect.Method;

public class C_ReflectionMethods {

    public static void main(String[] args) {

        Class<PublicPerson> publicPerson = PublicPerson.class;

        Method[] methods = publicPerson.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " return type: " + method.getReturnType());
        }
    }

}
