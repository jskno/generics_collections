package com.jskno.n_reflection;

import com.jskno.n_reflection.model.Bus;
import com.jskno.n_reflection.model.Person;
import com.jskno.n_reflection.model.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A_ReflectionGetClass {

    private static final Logger logger = LoggerFactory.getLogger(A_ReflectionGetClass.class.getName());

    public static void main(String[] args) {

        // First method to acquire the class
        Class<Person> c = Person.class;
        System.out.println(c.getName());

        // Second approach to acquire the class
        Class personClass = null;
        try {
            personClass = Class.forName("com.jskno.n_reflection.model.Person");
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage());
        }
        assert personClass != null;
        System.out.println(personClass.getName());

        checkClass(new Bus());

    }

    private static void checkClass(Vehicle vehicle) {
        Class c = vehicle.getClass();
        Class<? extends Vehicle> aClass = vehicle.getClass();
        System.out.println(aClass.getName());
    }

}
