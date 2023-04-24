package com.example.exchangeratechange.coursework;

import java.util.ArrayList;

public interface EmployeeService {
    Employee createEmployee(String firstName,String lastName);

    Employee removeEmployee(String firstname,String lastName);

    Employee findEmployee(String firstname,String lastName);

    ArrayList<Employee> showAllEmployees();
}
