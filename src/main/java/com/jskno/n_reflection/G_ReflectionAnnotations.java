package com.jskno.n_reflection;

import com.jskno.n_reflection.model.Employee;
import com.jskno.n_reflection.model.MyAnnotation;

import java.lang.reflect.Method;

public class G_ReflectionAnnotations {

    public static void main(String[] args) {

        Method[] methods = Employee.class.getMethods();

        for (Method method : methods) {
            System.out.println(method);
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("Method name: " + method.getName());
                System.out.println("MyAnnotation alias: " + myAnnotation.alias());
            }
        }
    }
}


