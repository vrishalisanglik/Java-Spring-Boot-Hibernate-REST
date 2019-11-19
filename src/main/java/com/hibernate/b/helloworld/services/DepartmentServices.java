package com.hibernate.b.helloworld.services;

import com.hibernate.b.helloworld.dao.DepartmentDao;
import com.hibernate.b.helloworld.dto.Department;

public class DepartmentServices {

	public DepartmentServices() {
		departmentDao = new DepartmentDao();
	}

	public Department addDepartment() {
		Department department = new Department();
		department.setDeptId(4);
		department.setDeptName("RnD");
		return departmentDao.addDept(department);
	}

	public void listDepartments() {
		java.util.List depts = departmentDao.listDepts();
		System.out.println("Listing all departments :");
		System.out.println(depts);
	}

	public void listDepartment(int id) {
		Department department = departmentDao.listDept(id);
		System.out.println(department);
	}

	DepartmentDao departmentDao;
}
