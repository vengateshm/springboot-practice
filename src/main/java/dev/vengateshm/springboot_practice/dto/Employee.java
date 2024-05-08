package dev.vengateshm.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.vengateshm.springboot_practice.validation.ValidateEmployeeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int empId;
    @NotBlank(message = "firstName shouldn't be null or empty")
    private String firstName;
    @NotBlank(message = "lastName shouldn't be null or empty")
    private String lastName;
    @Past(message = "start data shouldn't before current date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;
    @NotNull(message = "department shouldn't be null")
    @NotEmpty(message = "department shouldn't be empty")
    private String dept;
    @Email(message = "invalid email id")
    private String email;
    @ValidateEmployeeType
    private String employeeType; // permanent, vendor or contractual
}
