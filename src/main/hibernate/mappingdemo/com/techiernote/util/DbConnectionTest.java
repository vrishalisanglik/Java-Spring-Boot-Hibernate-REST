/**
 * 
 */
package com.techiernote.util;

import org.hibernate.Session;

/**
 * @author vs
 *
 */
public class DbConnectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();
	}

}
