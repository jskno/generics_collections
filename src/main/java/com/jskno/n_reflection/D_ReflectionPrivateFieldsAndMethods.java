package com.jskno.n_reflection;

import com.jskno.n_reflection.model.Person;
import com.jskno.n_reflection.model.PublicPerson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class D_ReflectionPrivateFieldsAndMethods {

    public static void main(String[] args) {


        Class<Person> person = Person.class;

        Field[] declaredFields = person.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getName());
        }

        Method[] methods = person.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " return type: " + method.getReturnType());
        }


    }
}
