package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.model.Address;
import com.test.model.Department;
import com.test.model.Employee;

public class App {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee e=ctx.getBean("employee",Employee.class);
	e.setId(1);
	e.setName("mani");
	e.setAddress(new Address());
	e.setRaisedSalary(10000);
	e.setDepartment(new Department());
	int id=e.getId();
	System.out.println(id);
	String name=e.getName();
	System.out.println(name);
	System.out.println(e.getRaisedSalary());
}
}
