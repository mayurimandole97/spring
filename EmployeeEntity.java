package com.test.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity

public class EmployeeEntity implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int employeeId;
private String firstName;
private String lastName;

@OneToMany(cascade=CascadeType.ALL)
@JoinTable(name="Employee_Account",
joinColumns= {@JoinColumn(name="EmployeeID",referencedColumnName="employeeId")},
inverseJoinColumns= {@JoinColumn(name="AccountId",referencedColumnName="accountid")})


private List<AccountEntity>accountList;
@Override
public String toString() {
	return "EmployeeEntity [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", accountList=" + accountList + "]";
}

public List<AccountEntity> getAccountList() {
	return accountList;
}

public void setAccountList(List<AccountEntity> accountList) {
	this.accountList = accountList;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}



public EmployeeEntity( String firstName, String lastName) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	
}

public EmployeeEntity() {
	super();
}

}
