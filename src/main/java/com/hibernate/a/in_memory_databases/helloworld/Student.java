package com.hibernate.a.in_memory_databases.helloworld;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
	@Id
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_STUDENT_ID", sequenceName = "SEQ_STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STUDENT_ID")
	private int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
