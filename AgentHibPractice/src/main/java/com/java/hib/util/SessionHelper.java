package com.java.hib.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionHelper {
	public static SessionFactory getSession() {
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}
	//Hi this is updated file in the github
}
