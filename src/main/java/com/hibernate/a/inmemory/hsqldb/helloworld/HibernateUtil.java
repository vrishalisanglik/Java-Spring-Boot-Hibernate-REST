package com.hibernate.a.inmemory.hsqldb.helloworld;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = (new Configuration()).configure("/hibernate.inmemory.hsqldb.cfg.xml");
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
