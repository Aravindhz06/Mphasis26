package com.java.hib.dao;

import java.util.List;

import com.java.hib.model.Agent;


public interface AgentDao {
	List<Agent> showAgent();
	Agent searchAgent(int agentId);
	String updateAgent(Agent agent);
	String deleteAgent(int agentId);
	String addAgent(Agent agent);
}
