package com.ds.springsecurity.interfaces.impl;

import com.ds.springsecurity.interfaces.NameValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class NameValidatorImpl implements ConstraintValidator<NameValidator, String> {

    public String message;
    public String[] values;


    @Override
    public void initialize(NameValidator constraintAnnotation) {
        this.message = constraintAnnotation.message();
        this.values = constraintAnnotation.values();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        List<String> lstValues = Arrays.asList(this.values);
        return value != null && !value.isEmpty() && lstValues.contains(value);
    }
}
