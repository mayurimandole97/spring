package com.test.model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import firsthibernate.util.HibernateUtil;

public class TestSpringEmp {
	private static EmpService service;
public static void main(String[] args) {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	ctx.registerShutdownHook();
	Employee e1=ctx.getBean("employee",Employee.class);
	System.out.println(e1);
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter new name");
	e1.setName(scanner.nextLine());
	System.out.println(e1);
	
	//to check scope 
	Employee e2=ctx.getBean("employee",Employee.class);
	System.out.println(e2);
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	
	 service =ctx.getBean("empService",EmpService.class);
	service.addEmployee(e1);

	SessionFactory sessionFactory=ctx.getBean("sessionFactory",SessionFactory.class);
	
	
//NumberGenerator ng=ctx.getBean("ng",NumberGenerator.class);
Integer rn=ctx.getBean("randomNumber",Integer.class);
System.out.println(rn);
}
}
