package com.hibernate.a.in_memory_databases.helloworld;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;

public class TestDb {

	public static void main(String args[]) {
		try {
			Session session = DbUtil.getSessionFactory().openSession();
			createStudent(session);
			System.out.println(getAllStudent(session));
//			deleteAllStudents(session);
//			System.out.println(getAllStudent(session));
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			DbUtil.shutdown();
		}
	}

	private static void deleteAllStudents(Session session) {
		session.beginTransaction();
		List<Student> allStudent = (List<Student>) getAllStudent(session);
		for (Student student : allStudent) {
			session.delete(student);
		}
		session.getTransaction().commit();
	}

	private static void createStudent(Session session) {
		Student student = new Student();
		student.setName("Some name");
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
	}
	
	private static Collection<?> getAllStudent(Session session) {
		return session.createCriteria(Student.class).list();
	}
}
