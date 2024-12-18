package com.jskno.b_bounded_type_parameters.b_using_created_class;

public class App {

    public static void main(String[] args) {
        System.out.println(calculateMin(32, 54));
        System.out.println(calculateMin("f", "a"));
        System.out.println(calculateMin("Kevin", "Ana"));

        System.out.println(calculateMin(
            new Person("Adam", 45),
            new Person("Kevin", 78)
        ));
    }

    public static <T extends Comparable<T>> T calculateMin(T element1, T element2) {
        if (element1.compareTo(element2) < 0) {
            return element1;
        }
        return element2;
    }

}

class Person implements Comparable<Person> {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age,otherPerson.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
