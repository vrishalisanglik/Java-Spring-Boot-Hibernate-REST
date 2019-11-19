package com.hibernate.b.helloworld.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.b.helloworld.App;
import com.hibernate.b.helloworld.dto.Department;

public class DepartmentDao {

	public DepartmentDao() {
	}

	public Department addDept(Department department) {

		try (Session session = App.getFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(department);
			session.flush();
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return department;
	}

	public List<Department> listDepts() {
		List<Department> departments = null;
		try (Session session = App.getFactory().openSession();) {
			departments = session.createQuery("select dept from Department dept").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return departments;
	}

	public Department listDept(int deptId) {
		Department department;
		department = null;
		try (Session session = App.getFactory().openSession();) {
			department = (Department) session.get(Department.class, Integer.valueOf(deptId));
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return department;
	}

	public void deleteDept() {
	}

	public void updateDept() {
	}
}
