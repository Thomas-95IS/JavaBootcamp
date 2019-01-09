package src.main.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import src.main.java.domain.Employee;
import src.main.java.domain.EmployeeFactory;
import src.main.java.business.EmployeeLogic;


public class Main {
  public static void main(String[] args) {
    final int N_EMPLOYEES = 2;
    Employee[] employees = new Employee[N_EMPLOYEES];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < N_EMPLOYEES; i++) {
      System.out.println("Enter the name of employee " + i);
      String name = sc.next();

      System.out.println("Enter the salary of employee " + i);
      int salary = sc.nextInt();

      employees[i] = EmployeeFactory.createEmployee(name, salary);
    }

    /*
      Calculate the mean salary of the Employees
    */

    float meanSalary = EmployeeLogic.getMeanSalary(employees);

    System.out.println("Mean salary: " + meanSalary);

    /*
      Find the max salary of the Employees
    */

    int maxSalary = EmployeeLogic.getMaxSalary(employees);

    System.out.println("Max salary: " + maxSalary);

    sc.close();
  }
}
