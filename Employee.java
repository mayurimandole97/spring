package com.test.model;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Employee implements Serializable,InitializingBean{
private int id;
private String name;
private Address address;
private Department department;
private int sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setRaisedSalary(int sal)
{
	this.sal= sal;
}
public int getRaisedSalary() 
{
	throw new NumberFormatException();
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Employee(int id, String name, Address address, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.department = department;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department + "]";
}
/*public void init()
{
	System.out.println("employee bean initialized");
}
public void destroy()
{
	System.out.println("employee bean destroyed");
}*/
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}
@PostConstruct
public void init1(){System.out.println("emp bean created");}

@PreDestroy
public void des() {System.out.println("bean getting destroyed");}
}
