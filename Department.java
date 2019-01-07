package com.test.model;

import org.springframework.stereotype.Component;

@Component
public class Department {
private int deptid;
private String deptName;
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
@Override
public String toString() {
	return "Department [deptid=" + deptid + ", deptName=" + deptName + "]";
}
public Department(int deptid, String deptName) {
	super();
	this.deptid = deptid;
	this.deptName = deptName;
}
public Department() {
	super();
}

}
