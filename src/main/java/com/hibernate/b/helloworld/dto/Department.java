package com.hibernate.b.helloworld.dto;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private int deptId;
	private String deptName;
	//private Set employees;

	public String toString() {
		return (new StringBuilder("Department [deptId=")).append(deptId).append(", deptName=").append(deptName)
				.append("]").toString();
	}

	public Department() {
	}

	public Department(int deptId, String deptName/*, Set employees*/) {
		this.deptId = deptId;
		this.deptName = deptName;
		//this.employees = employees;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

//	public Set getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(Set employees) {
//		this.employees = employees;
//	}

}
