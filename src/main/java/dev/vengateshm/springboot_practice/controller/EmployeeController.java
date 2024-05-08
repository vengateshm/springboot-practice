package dev.vengateshm.springboot_practice.controller;

import dev.vengateshm.springboot_practice.dto.Employee;
import dev.vengateshm.springboot_practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
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
