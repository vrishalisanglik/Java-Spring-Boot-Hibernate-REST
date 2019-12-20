package com.techiernote.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techiernote.dto.Department;
import com.techiernote.dto.Employee;
import com.techiernote.util.HibernateUtil;

public class Write {

	public static void main(String[] args) {
		Transaction tx =  null;
		try(Session session = HibernateUtil.getSessionFactory().openSession() ) {
			tx = session.beginTransaction();
			
			Employee employee1 = new Employee();
			employee1.setEmployeeName("ABC");
			Employee employee2 = new Employee();
			employee2.setEmployeeName("DEF");
			Employee employee3 = new Employee();
			employee3.setEmployeeName("GHI");
			
			Department department1 = new Department();
			department1.setDeptName("Engg");
			
			department1.getEmployees().add(employee1);
			employee1.setDepartment(department1);
			department1.getEmployees().add(employee2);
			employee2.setDepartment(department1);
			
			Department department2 = new Department();
			department2.setDeptName("QA");
			
			department2.getEmployees().add(employee3);
			employee3.setDepartment(department2);
			
			session.persist(department1);
			session.persist(department2);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	}
}