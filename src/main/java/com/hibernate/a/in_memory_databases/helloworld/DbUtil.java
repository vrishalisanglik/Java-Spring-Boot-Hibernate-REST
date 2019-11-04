package com.hibernate.a.in_memory_databases.helloworld;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DbUtil {

	private static final String HSQL_EMBEDDED_CONFIG = "/hibernate.hsqldb.mode.embedded.cfg.xml";
	private static final String HSQL_SERVER_CONFIG = "/hibernate.hsqldb.mode.server.cfg.xml";

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = (new Configuration()).configure(HSQL_SERVER_CONFIG);
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
			configuration.addAnnotatedClass(Student.class);
			serviceRegistryBuilder.applySettings(configuration.getProperties());
			org.hibernate.service.ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

}
