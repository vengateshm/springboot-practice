package com.vengateshm.practice.SpringBootPractice.service;

import com.vengateshm.practice.SpringBootPractice.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {
    public Employee addEmployee(Employee employee) {
        employee.setEmpId(new Random().nextInt(68736432));
        return employee;
    }
}
