package com.test.model;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class EmpController {

public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	EmpService empService=ctx.getBean("empService",EmpService.class);
	empService.addEmployee(new Employee());
	Employee e=ctx.getBean("employee",Employee.class);//bean created by xml from Employee.java
	System.out.println(e);
	empService.delEmployee(e);//delete bean created 
}
}
