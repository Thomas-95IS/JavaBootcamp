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
        String jsonString = this.readFile(this.jsonPath, StandardCharsets.UTF_8);
        Gson gson = new Gson();
        Employee[] employees = gson.fromJson(jsonString, Employee[].class);

        return employees;
    }
}
