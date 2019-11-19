package com.hibernate.b.helloworld.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	//private Department empDept;
	
	public String toString() {
		return (new StringBuilder("Employee [empId=")).append(empId).append(", empName=").append(empName).append("]")
				.toString();
	}

	public Employee() {
	}

	public Employee(int empId, String empName/*, Department empDept*/) {
		this.empId = empId;
		this.empName = empName;
		//this.empDept = empDept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

//	public Department getEmpDept() {
//		return empDept;
//	}
//
//	public void setEmpDept(Department empDept) {
//		this.empDept = empDept;
//	}

}
