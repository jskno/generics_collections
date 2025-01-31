package com.jskno.n_reflection;

import com.jskno.n_reflection.model.Person;
import com.jskno.n_reflection.model.PublicPerson;
import java.lang.reflect.Field;

public class B_ReflectionFields {

    public static void main(String[] args) {

        // Person with private fields
        Class<Person> personClass = Person.class;

        System.out.println(personClass.getName());
        System.out.println(personClass.getSimpleName());
        System.out.println(personClass.getCanonicalName());

        System.out.println(personClass.getPackage());

        System.out.println(personClass.getFields().length);

        // Not able to access doing this PRIVATE FIELDS
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // Person with public fields
        Class<PublicPerson> publicPerson = PublicPerson.class;

        System.out.println(publicPerson.getName());
        System.out.println(publicPerson.getSimpleName());
        System.out.println(publicPerson.getCanonicalName());

        System.out.println(publicPerson.getPackage());

        System.out.println(publicPerson.getFields().length);

        // Not able to access doing this PRIVATE FIELDS
        Field[] fieldsPublicPerson = publicPerson.getFields();
        for (Field field : fieldsPublicPerson) {
            System.out.println(field.getName());
        }


    }

}
