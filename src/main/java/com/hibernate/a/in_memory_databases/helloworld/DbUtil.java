package com.hibernate.a.in_memory_databases.helloworld;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DbUtil {

	private static final String HSQL_EMBEDDED_CONFIG = "/hibernate.hsqldb.mode.embedded.cfg.xml";
	private static final String HSQL_SERVER_CONFIG = "/hibernate.hsqldb.mode.server.cfg.xml";
	private static final String H2_EMBEDDED_CONFIG = "/hibernate.h2.mode.embedded.cfg.xml";
	private static final String H2_SERVER_CONFIG = "/hibernate.h2.mode.server.cfg.xml";
	private static final String DERBY_EMBEDDED_CONFIG = "/hibernate.derby.mode.embedded.cfg.xml";
	private static final String DERBY_SERVER_CONFIG = "/hibernate.derby.mode.server.cfg.xml";

	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			if (sessionFactory == null) {
				Configuration configuration = (new Configuration()).configure(DERBY_EMBEDDED_CONFIG);
				StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
				configuration.addAnnotatedClass(Student.class);
				serviceRegistryBuilder.applySettings(configuration.getProperties());
				org.hibernate.service.ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
