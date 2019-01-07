package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpService implements IEmpService {

	@Autowired
	private IEmpDAOImpl dao;

	@Override
	public void addEmployee(Employee e) {
		dao.addEmployee( e);
		
	}

	@Override
	public void delEmployee(Employee e) {
		dao.delEmployee( e);
		
	}
	
}
