package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.AgentNotFoundException;
import com.example.demo.model.Agent;
import com.example.demo.repo.AgentRepository;


@Service
public class AgentService {

	@Autowired
	private AgentRepository repo;
	
	public Agent searchAgent(int agentId) {
	    return repo.findById(agentId)
	            .orElseThrow(() -> new AgentNotFoundException("Agent Id Not Found..."));
	}
	
	public String deleteAgent(int agentId) {
		Agent agent = searchAgent(agentId);
		repo.delete(agent);
		return "Agent Record Deleted...";
	}
	
	public String updateAgent(Agent agent) {
		repo.save(agent);
		return "Agent Record Updated...";
	}
	
	public String addAgent(Agent agent) {
		repo.save(agent);
		return "Agent Record Inserted...";
	}
	
	public List<Agent> showAgent() {
		return repo.findAll();
	}
	
}
