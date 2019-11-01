package com.hibernate.a.inmemory.hsqldb.helloworld;

import org.hibernate.Session;

public class TestInMemory {

	public static void main(String args[]) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			createStudent(session);
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			HibernateUtil.shutdown();
		}
	}

	private static void createStudent(Session session) {
		Student student = new Student();
		student.setId(1);
		student.setName("Vrishali");
		session.save(student);
	}

}
