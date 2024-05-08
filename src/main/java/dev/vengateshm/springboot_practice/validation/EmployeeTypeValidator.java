package dev.vengateshm.springboot_practice.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType, String> {
    @Override
    public void initialize(ValidateEmployeeType constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext context) {
        List<String> employeeTypes = Arrays.asList("Permanent", "Vendor");
        return employeeTypes.contains(employeeType);
    }
}
