package com.ds.springsecurity;

import com.ds.springsecurity.domain.Person;
import org.hibernate.validator.internal.engine.ValidatorFactoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("Maria");
		p.setAge(18);
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<Person>> validationErrors = validator.getValidator().validate(p);

		if(!validationErrors.isEmpty()){
			validationErrors.stream().forEach(a -> System.out.println(a));
		}
	}
}
