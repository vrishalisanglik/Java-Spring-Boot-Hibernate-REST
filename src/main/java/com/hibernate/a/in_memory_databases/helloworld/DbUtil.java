package com.hibernate.a.in_memory_databases.helloworld;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DbUtil {

	private static final String HSQL_EXTERNAL_CONFIG = "/hibernate.hsqldb.external.cfg.xml";
	private static final String HSQL_INMEMORY_CONFIG = "/hibernate.hsqldb.inmemory.cfg.xml";

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = (new Configuration()).configure(HSQL_EXTERNAL_CONFIG);
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
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
