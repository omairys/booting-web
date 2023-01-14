package com.omairys.lil.sbet.landon.roomwebapp.controllers;


import com.omairys.lil.sbet.landon.roomwebapp.models.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
    private static final List<Employees> employees = new ArrayList<>();

    static {
        employees.add(new Employees(1, "9f717667", "Adams", "Roy", "HOUSEKEEPING"));
        employees.add(new Employees(2, "3cb69467", "Adams", "Martin", "SECURITY"));
        employees.add(new Employees(3, "a36df0b3", "Alvarez", "Roger", "FRONT_DESK"));
        employees.add(new Employees(4, "0e235279", "Alvarez", "Anne", "HOUSEKEEPING"));
    }

    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees", employees);
        return "employees";
    }
}
