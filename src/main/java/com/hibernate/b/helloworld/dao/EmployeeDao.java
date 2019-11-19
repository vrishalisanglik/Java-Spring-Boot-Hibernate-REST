package com.hibernate.b.helloworld.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.b.helloworld.App;
import com.hibernate.b.helloworld.dto.Department;
import com.hibernate.b.helloworld.dto.Employee;

public class EmployeeDao {

	public EmployeeDao() {
	}

	public void listEmployees() {
	}

	public void listEmployee(int id) {
		Employee gotEmp = null;
		try (Session session = App.getFactory().openSession();) {
			Employee loadedEmp = (Employee) session.load(Employee.class, Integer.valueOf(id));
			System.out.println(loadedEmp);
			//System.out.println(loadedEmp.getEmpDept());
			System.out.println((new StringBuilder("State of Employee object ----- "))
					.append(session.getStatistics().getEntityKeys().toString()).toString());
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		try (Session session = App.getFactory().openSession();) {
			System.out.println("============================ SESSION CLOSED =============================");
			System.out.println((new StringBuilder("State of Employee object ----- "))
					.append(session.getStatistics().getEntityKeys().toString()).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Employee addEmployees(Employee employee1) throws Exception {
		try (Session session = App.getFactory().openSession();) {
			Transaction transaction = session.beginTransaction();
			Employee employee = new Employee();
			DepartmentDao departmentDao = new DepartmentDao();
			employee.setEmpId(5);
			employee.setEmpName("MNOP");
			Department department = departmentDao.listDept(1);
			//employee.setEmpDept(department);
			session.flush();
			transaction.commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return employee1;
	}

	public void deleteEmployees() {
	}

	public void updateEmployee(int empId, String name) {
		try (Session session = App.getFactory().openSession();) {
			Employee employee = (Employee) session.load(Employee.class, Integer.valueOf(empId));
			session.getTransaction().begin();
			employee.setEmpName(name);
			session.getTransaction().commit();
			System.out.println(employee);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
