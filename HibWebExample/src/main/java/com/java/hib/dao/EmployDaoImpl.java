package com.java.hib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		return query.list();
	}

	@Override
	public Employ searchEmploy(int empno) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		return (Employ)query.uniqueResult();
	}

	@Override
	public String updateEmploy(Employ employ) {
		sessionFactory=SessionHelper.getSession();
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.saveOrUpdate(employ);
		trans.commit();
		return "Record Updated...";
	}

	@Override
	public String deleteEmploy(int empno) {
		Employ employ=searchEmploy(empno);
		Transaction trans=session.beginTransaction();
		session.delete(employ);
		trans.commit();
		return "Record Deleted...";
	}

	@Override
	public String addEmploy(Employ employ) {
		sessionFactory=SessionHelper.getSession();
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Record Updated...";
	}

}