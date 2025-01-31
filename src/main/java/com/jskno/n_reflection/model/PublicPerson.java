package com.jskno.n_reflection.model;

public class PublicPerson {

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String returnName() {
        return name + "is the name with age: " + age;
    }
}
