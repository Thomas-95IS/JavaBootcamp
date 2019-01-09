package src.main.java.business;

import java.util.Arrays;
import java.util.stream.Stream;

import src.main.java.domain.Employee;
import src.main.java.domain.EmployeeFactory;


public class EmployeeLogic {
    public static float getMeanSalary(Employee[] employees) {
        float meanSalary = 0;

        for(Employee e : employees) {
            System.out.println("Name: " + e.getName() + "\n" + "Salary: " + e.getSalary());
            meanSalary += e.getSalaryAsFloat();
        }

        return (meanSalary / employees.length) ;
    }

    public static int getMaxSalary(Employee[] employees) {
        Stream<Employee> employeeStream = Arrays.stream(employees);
        int maxSalary = employeeStream.mapToInt(e -> e.getSalary()).max().getAsInt();

        return maxSalary;
    }
}