package com.ds.springsecurity.interfaces;

import com.ds.springsecurity.interfaces.impl.NameValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidatorImpl.class)
public @interface NameValidator {

    String message() default "Persons name isn't accepted";

    String[] values();

    Class<?>[] groups() default {}; //Required by Constraint

    Class<? extends Payload>[] payload() default {}; //Required by Constraint
}
