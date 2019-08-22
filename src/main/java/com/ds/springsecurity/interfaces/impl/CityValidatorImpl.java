package com.ds.springsecurity.interfaces.impl;

import com.ds.springsecurity.interfaces.CityValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class CityValidatorImpl implements ConstraintValidator<CityValidator, String> {

    public String message;
    public String address;

    @Override
    public void initialize(CityValidator constraintAnnotation) {
        this.message = constraintAnnotation.message();
        this.address = constraintAnnotation.city();
    }

    @Override
    public boolean isValid(String address, ConstraintValidatorContext constraintValidatorContext) {
        return address == null || Objects.equals(this.address, address);
    }
}
