package com.hibernate.b.helloworld.services;

import com.hibernate.b.helloworld.dao.DepartmentDao;
import com.hibernate.b.helloworld.dao.EmployeeDao;
import com.hibernate.b.helloworld.dto.Employee;

public class EmployeeServices {

	public EmployeeServices() {
		employeeDao = new EmployeeDao();
		departmentDao = new DepartmentDao();
	}

	public Employee addEmployee() throws Exception {
		Employee employee = new Employee();
		return employeeDao.addEmployees(employee);
	}

	public void listEmployee(int id) {
		employeeDao.listEmployee(id);
	}

	public void updateEmployee(int id, String name) throws Exception {
		employeeDao.updateEmployee(id, name);
	}

	EmployeeDao employeeDao;
	DepartmentDao departmentDao;
}
