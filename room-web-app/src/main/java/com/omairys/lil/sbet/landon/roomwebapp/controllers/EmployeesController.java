package com.omairys.lil.sbet.landon.roomwebapp.controllers;


import com.omairys.lil.sbet.landon.roomwebapp.models.Employees;
import com.omairys.lil.sbet.landon.roomwebapp.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
    private static EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getAllEmployee(Model model){
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }
}
