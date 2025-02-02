package com.jskno.n_reflection.model;

// When making singleton classes, consider using an enum.
// It solves the problems that can crop up with (de)serialization and reflection.

// One thing to remember here is, when serializing an enum, field variables are not getting serialized.
// For example, if we serialize and deserialize the SingletonEnum class, we will lose the value of the int value field
public enum SingletonEnum {
    INSTANCE;

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
