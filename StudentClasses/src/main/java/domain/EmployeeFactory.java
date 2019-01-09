package src.main.java.domain;

import src.main.java.domain.Employee;


public class EmployeeFactory {
    public static Employee createEmployee(String name, int salary) {
        return new Employee(name, salary);
    }
}
