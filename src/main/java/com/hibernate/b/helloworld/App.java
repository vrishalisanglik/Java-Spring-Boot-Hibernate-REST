package com.hibernate.b.helloworld;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.b.helloworld.services.DepartmentServices;
import com.hibernate.b.helloworld.services.EmployeeServices;

public class App {

	public static void main(String args[]) {
		try {
			departmentServices();
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeFactory();
	}

	private static void departmentServices() {
		departmentServices.addDepartment();
	}

	private static void employeeServices() throws Exception {
		employeeServices.updateEmployee(2, "qqqqqq");
	}

	public static SessionFactory getFactory() {
		return sessionFactory;
	}

	public static void closeFactory() {
		try {
			sessionFactory.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static DepartmentServices departmentServices = new DepartmentServices();
	private static EmployeeServices employeeServices = new EmployeeServices();
	private static SessionFactory sessionFactory;

	static {
		org.hibernate.boot.registry.BootstrapServiceRegistry bootstrapServiceRegistry = (new BootstrapServiceRegistryBuilder())
				.build();
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder(
				bootstrapServiceRegistry);
		org.hibernate.boot.registry.StandardServiceRegistry standardServiceRegistry = standardServiceRegistryBuilder
				.configure(new File("./src/main/resources/hibernate.cfg.xml")).build();
		MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.buildMetadata();
		sessionFactory = metadata.buildSessionFactory();
	}
}
