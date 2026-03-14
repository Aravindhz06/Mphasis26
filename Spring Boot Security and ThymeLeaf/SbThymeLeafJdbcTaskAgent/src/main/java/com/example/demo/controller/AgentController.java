package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Agent;
import com.example.demo.service.AgentService;

@Controller
public class AgentController {

	@Autowired
    private AgentService agentService;
	
	 @GetMapping("/addagent")
	    public String addNewAgent(Model model) {
		 Agent agent = new Agent();
	        model.addAttribute("agent", agent);
	        return "addagent";
	    }
	 
	  @PostMapping("/savenew")
	    public String saveAgent(@ModelAttribute("agent") Agent agent) {
		  agentService.addAgent(agent);
	        return "redirect:/";
	    }
	  
	  
	    @PostMapping("/saveagent")
	    public String saveAgentt(@ModelAttribute("agent") 
	         Agent agent) {
	    	agentService.updateAgent(agent);
	        return "redirect:/";
	    }
	    
	    @GetMapping(value="/updateform/{agentId}")
	    public String updateForm(@PathVariable(value="agentId") int agentId,
	    		Model model
	    		) {
	    	Agent agent = agentService.searchAgent(agentId);
	    	model.addAttribute(agent);
	    	return "updateform";
	    }
	    
	    @GetMapping(value="/deleteagent/{agentId}")
	    public String deleteagent(@PathVariable(value="agentId") int agentId
	    		) {
	    	agentService.deleteAgent(agentId);
	    	return "redirect:/";
	    }
	    
	    @GetMapping("/")
	    public String showAgent(Model model) {
	        List<Agent> agentList = agentService.showAgent();
	        model.addAttribute("agentList", agentList);
	        return "agentshow";   // agentshow.html
	    }
}
