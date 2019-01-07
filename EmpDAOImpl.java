package com.test.model;

import org.springframework.stereotype.Repository;

@Repository("emp")
public class EmpDAOImpl implements IEmpDAOImpl {

	@Override
	public void addEmployee(Employee e) {
	System.out.println("emp added");
		
	}

	@Override
	public void delEmployee(Employee e) {
		System.out.println("emp deleted");
		
	}

}
