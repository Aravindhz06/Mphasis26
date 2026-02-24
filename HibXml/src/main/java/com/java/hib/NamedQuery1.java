package com.java.hib;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.hib.util.SessionHelper;

public class NamedQuery1 {
	public static void main(String[] args) {
		SessionFactory sf=SessionHelper.getSession();
		Session session=sf.openSession();
		Query query=session.getNamedQuery("showEmploy");
		query.list().forEach(System.out::println);
	}
}
