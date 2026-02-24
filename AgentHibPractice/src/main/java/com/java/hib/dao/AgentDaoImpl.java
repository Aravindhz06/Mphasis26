package com.java.hib.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.hib.model.Agent;
import com.java.hib.util.SessionHelper;



public class AgentDaoImpl implements AgentDao{
	
	SessionFactory sessionFactory;
	Session session;

	@Override
	public List<Agent> showAgent() {
		sessionFactory=SessionHelper.getSession();
		session=sessionFactory.openSession();
		Query query=session.createQuery("from Agent");
		return query.list();
	}

	@Override
	public Agent searchAgent(int agentId) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Agent where agentId="+agentId);
		return (Agent)query.uniqueResult();
	}

	@Override
	public String updateAgent(Agent agent) {
		sessionFactory=SessionHelper.getSession();
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.saveOrUpdate(agent);
		trans.commit();
		return "Record Updated...";
	}

	@Override
	public String deleteAgent(int agentId) {
		Agent agent=searchAgent(agentId);
		Transaction trans=session.beginTransaction();
		session.delete(agent);
		trans.commit();
		return "Record Deleted...";
	}

	@Override
	public String addAgent(Agent agent) {
		sessionFactory=SessionHelper.getSession();
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(agent);
		trans.commit();
		return "Record Added...";
	}

}
