package com.jskno.n_reflection;

import com.jskno.n_reflection.model.SingletonEnum;
import com.jskno.n_reflection.model.Test;
import com.jskno.n_reflection.model.Test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class E1_ReflectionConstructor {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<Test> constructor = Test.class.getDeclaredConstructor();

        // We can instantiate a new Test object with public constructor
        Test test0 = new Test();

        // We can also instantiate a new object of Test class by Reflection
        Test test1 = constructor.newInstance();
        System.out.println(test1);

        // We cannot instantiate a Test object using the private constructor
        //Test2 test2 = new Test2("myName");

        // But we can use that private constructor by Reflection
        // despite the fact that it is a private constructor
        // so the Singleton approach of declaring a unique private constructor does not guarantee
        // that there will be only an object of Test2 class
        Constructor<Test2> constructor2 = Test2.class.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true);
        Test2 test3 = constructor2.newInstance("myName");
        Test2 test4 = constructor2.newInstance("anotherName");
        System.out.println(test3);
        System.out.println(test4);

        // Solution Singleton with Joshua Bloch's solution:
        // Use Enums instead of private constructor
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        System.out.println(singletonEnum.getName());
        singletonEnum.setName("anotherName");
        System.out.println(singletonEnum.getName());



    }
}
