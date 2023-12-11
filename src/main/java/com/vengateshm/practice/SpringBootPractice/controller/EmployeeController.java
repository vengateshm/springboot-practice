package com.vengateshm.practice.SpringBootPractice.controller;

import com.vengateshm.practice.SpringBootPractice.dto.Employee;
import com.vengateshm.practice.SpringBootPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Get comma separated request params as list
    @GetMapping("/comma-separated-ids")
    public String commaSeparatedIds(@RequestParam(name = "ids") List<Long> ids) {
        return "Ids : " + ids;
    }
}
