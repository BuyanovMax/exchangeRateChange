package com.example.exchangeratechange.coursework;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final ArrayList<Employee> employees;

    public EmployeeServiceImpl(ArrayList<Employee> employees) {
        this.employees = new ArrayList<>();
    }

    public Employee createEmployee(String firstName, String lastName) {
       Employee employee = new Employee(firstName,lastName);
        if (employees.size() > 2) {
            throw new EmployeeStorageIsFullException("ArrayIsFull");
        }
        else if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("EmployeeAlreadyAdded");
        } else {
            this.employees.add(employee);
        }
        return employee;
    }
    @Override
    public Employee removeEmployee(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (employees.remove(employee)) {
            employees.remove(employee);
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Employee findEmployee(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (employees.contains(employee)) {
            return employee;
        }
         throw new EmployeeNotFoundException("Employee not found");
    }


    public Collection<Employee> showAllEmployees() {
        return Collections.unmodifiableList(employees);
    }


}
