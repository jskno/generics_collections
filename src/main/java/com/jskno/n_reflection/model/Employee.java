package com.jskno.n_reflection.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee extends Person implements Comparable<Employee>, Serializable {

    private String position;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(String position, BigDecimal salary) {
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @MyAnnotation(alias = "myPayRaise")
    public BigDecimal increaseSalary(BigDecimal amount) {
        return salary.add(amount);
    }

    @Override
    public int compareTo(Employee employee) {
        return employee.salary.compareTo(salary);
    }
}