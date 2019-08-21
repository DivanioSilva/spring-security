package com.ds.springsecurity.interfaces.impl;

import com.ds.springsecurity.interfaces.AgeValidator;
import com.ds.springsecurity.interfaces.NameValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AgeValidatorImpl implements ConstraintValidator<AgeValidator, Integer> {

    public String message;
    public Integer minimumAge;

    @Override
    public void initialize(AgeValidator constraintAnnotation) {
        this.message = constraintAnnotation.message();
        this.minimumAge = constraintAnnotation.mininumAge();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if(age >= this.minimumAge){
            result = true;
        }
        return result;
    }
}
