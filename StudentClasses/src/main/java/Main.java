package src.main.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import src.main.java.domain.Employee;
import src.main.java.domain.EmployeeFactory;
import src.main.java.business.EmployeeLogic;
import src.main.java.repository.RepositoryImplementation;


public class Main {
  public static void main(String[] args) {
    RepositoryImplementation repo = new RepositoryImplementation();
    Employee[] employees = repo.getEmployees();

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

  }
}
