package com.jskno.n_reflection;

import com.jskno.n_reflection.model.Employee;
import com.jskno.n_reflection.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class E_ReflectionAnnotations {

    private final static Logger log = LoggerFactory.getLogger(E_ReflectionAnnotations.class);

    public static void main(String[] args) {

        Class<Employee> employeeClass = null;
        Class<Person> personClass = null;

        try {
            employeeClass = (Class<Employee>) Class.forName("com.jskno.n_reflection.model.Employee");
            personClass = (Class<Person>) Class.forName("com.jskno.n_reflection.model.Person");
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e);
        }

        System.out.println("Superclass of Employee class is: " + employeeClass.getSuperclass());
        System.out.println("Superclass of Person class is: " + personClass.getSuperclass());

        Class[] interfaces = employeeClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

    }
}
