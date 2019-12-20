package com.techiernote.client;

import org.hibernate.Session;

import com.techiernote.dto.Employee;
import com.techiernote.util.HibernateUtil;

public class Read {

	public static void main(String[] args) {
		getEmp();
	}

	private static void getEmp() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Long id = 22L;
			Employee employee = session.get(Employee.class, id);
			if(employee != null) {
				System.out.println(employee);
				System.out.println(employee.getDepartment());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	}
}
