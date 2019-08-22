package com.ds.springsecurity.interfaces;

import com.ds.springsecurity.interfaces.impl.AgeValidatorImpl;
import com.ds.springsecurity.interfaces.impl.CityValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CityValidatorImpl.class)
public @interface CityValidator {

    String message() default "Only Lisbon is accepted";

    String city() default "Lisbon";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
