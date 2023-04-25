package com.example.exchangeratechange.coursework;

import java.util.ArrayList;
import java.util.Collection;

public interface EmployeeService {
    Employee createEmployee(String firstName,String lastName);

    Employee removeEmployee(String firstname,String lastName);

    Employee findEmployee(String firstname,String lastName);

    Collection<Employee> showAllEmployees();
}
