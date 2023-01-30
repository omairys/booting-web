package com.omairys.lil.sbet.landon.roomwebapp.service;

import com.omairys.lil.sbet.landon.roomwebapp.models.Employees;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final List<Employees> employees= new ArrayList();

    static {
        employees.add(new Employees(1, "9f717667", "Adams", "Roy", "HOUSEKEEPING"));
        employees.add(new Employees(2, "3cb69467", "Adams", "Martin", "SECURITY"));
        employees.add(new Employees(3, "a36df0b3", "Alvarez", "Roger", "FRONT_DESK"));
        employees.add(new Employees(4, "0e235279", "Alvarez", "Anne", "HOUSEKEEPING"));
    }

    @GetMapping
    public List<Employees> getAllEmployees(){
        return employees;
    }
}
