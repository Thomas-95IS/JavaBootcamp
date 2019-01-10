package src.main.java.repository;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import src.main.java.domain.Employee;
import src.main.java.domain.RepositoryInterface;

import com.google.gson.Gson;


public class RepositoryImplementation implements RepositoryInterface {
    String jsonPath = "src/main/resources/employeeInfo.json";

    @Override
    public Employee[] getEmployees() {
        return this.castJsonToEmployees();
    }

    private static String readFile(String path, Charset encoding) {
        byte[] encoded;

//        File folder = new File("src/main/resources");
//        File[] listOfFiles = folder.listFiles();
//
//        for (int i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isFile()) {
//                System.out.println("File " + listOfFiles[i].getName());
//            } else if (listOfFiles[i].isDirectory()) {
//                System.out.println("Directory " + listOfFiles[i].getName());
//            }
//        }

        try {
            encoded = Files.readAllBytes(Paths.get(path));
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return new String(encoded, encoding);
    }

    private Employee[] castJsonToEmployees() {
        Employee[] employees = new Employee[1];
        String jsonString = this.readFile(this.jsonPath, StandardCharsets.UTF_8);
        Gson gson = new Gson();
        employees[0] = gson.fromJson(jsonString, Employee.class);

        return employees;
    }
}
