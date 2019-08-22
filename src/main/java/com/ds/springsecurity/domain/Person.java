package com.ds.springsecurity.domain;

import com.ds.springsecurity.interfaces.AgeValidator;
import com.ds.springsecurity.interfaces.CityValidator;
import com.ds.springsecurity.interfaces.NameValidator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    @NameValidator(values = "Maria")
    private String name;
    @AgeValidator()
    private Integer age;
    @CityValidator()
    private String city;
}
