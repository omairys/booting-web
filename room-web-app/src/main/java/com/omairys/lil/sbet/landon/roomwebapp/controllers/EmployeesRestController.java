package com.omairys.lil.sbet.landon.roomwebapp.controllers;

import com.omairys.lil.sbet.landon.roomwebapp.models.Employees;
import com.omairys.lil.sbet.landon.roomwebapp.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeesRestController {
    private final EmployeeService employeeService;

    public EmployeesRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employees> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
