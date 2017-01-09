package com.vik.employee;

public class Employee {
    private long id;
    private String name;

    public Employee(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
