package src.main.java.domain;

import src.main.java.domain.stereotypes.Physical;


public class Employee implements Physical {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public float getSalaryAsFloat() {
        return (float) this.salary;
    }
}
