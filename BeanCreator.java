package com.test.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.model.Department;
import com.test.model.Employee;
@Configuration
public class BeanCreator {
	
@Bean
public Department department()
{
	return new Department();
}
@Bean
public Address address()
{
	return new Address();
}
@Bean
public NumberGenerator numberGenerator()
{
	return new NumberGenerator();
}
@Bean
public Employee employee()
{
	return new Employee();
}
}
