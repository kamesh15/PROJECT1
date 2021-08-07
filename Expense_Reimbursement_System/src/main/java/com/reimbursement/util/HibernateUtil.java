package com.reimbursement.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		return sessionfactory;
}
}
