package com.ds.springsecurity.domain;

import com.ds.springsecurity.interfaces.AgeValidator;
import com.ds.springsecurity.interfaces.NameValidator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    @NameValidator(message = "Users name isn't right", values = "Maria")
    private String name;
    @AgeValidator(message = "Age isn't accepted", mininumAge = 18)
    private Integer age;
}
