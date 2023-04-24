package com.example.exchangeratechange.coursework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/employee")
//public class EmployeeController {
//    private final EmployeeService employeeService;
//
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//    @GetMapping(path = "/add")
//    public String addEmployee(@RequestParam String firstName, @RequestParam String lastName) {
//        employeeService.addEmployee(firstName,lastName);
//        return "Employee added";
//    }
//    @GetMapping(path = "/remove")
//    public String removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
//        employeeService.addEmployee(firstName,lastName);
//        return "Employee remove";
//    }
//    @GetMapping(path = "/find")
//    public String findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
//        employeeService.addEmployee(firstName,lastName);
//        return "Employee find";
//    }
//
//}
