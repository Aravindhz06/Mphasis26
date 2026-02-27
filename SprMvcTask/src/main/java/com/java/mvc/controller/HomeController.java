package com.java.mvc.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.java.mvc.model.Patient;

@Controller
public class HomeController {
	

	
	private static List<Patient> patientList=new ArrayList<>(Arrays.asList(
			new Patient(101, "Arun Kumar", "MALE", 55000.0, "Chennai", "Tamil Nadu", "POL12345", 30000.0, "Star Health", 25000.0),
			new Patient(102, "Priya Sharma", "FEMALE", 72000.0, "Bangalore", "Karnataka", "POL98765", 50000.0, "Apollo Insurance", 22000.0),
			new Patient(103, "Rahul Verma", "MALE", 45000.0, "Hyderabad", "Telangana", "POL24680", 20000.0, "ICICI Lombard", 25000.0),
			new Patient(104, "Sneha Reddy", "FEMALE", 81000.0, "Mumbai", "Maharashtra", "POL13579", 60000.0, "HDFC Ergo", 21000.0),
			new Patient(105, "Kiran Raj", "MALE", 39000.0, "Coimbatore", "Tamil Nadu", "POL55555", 15000.0, "New India Assurance", 24000.0),
			new Patient(106, "Lakshmi Devi", "FEMALE", 96000.0, "Kochi", "Kerala", "POL11223", 70000.0, "United India Insurance", 26000.0),
			new Patient(107, "Vijay Anand", "MALE", 68000.0, "Pune", "Maharashtra", "POL33445", 40000.0, "Bajaj Allianz", 28000.0),
			new Patient(108, "Meena Kumari", "FEMALE", 52000.0, "Mysuru", "Karnataka", "POL77889", 20000.0, "Reliance Health", 32000.0),
			new Patient(109, "Suresh Babu", "MALE", 88000.0, "Vizag", "Andhra Pradesh", "POL99112", 60000.0, "Kotak Insurance", 28000.0),
			new Patient(110, "Anita Joseph", "FEMALE", 41000.0, "Trivandrum", "Kerala", "POL66442", 25000.0, "SBI Health", 16000.0)
			));
	
	@RequestMapping(value="/showpatient")
	public ModelAndView showpatient() {
		return new ModelAndView ("showpatient","patientList",patientList);
	}
	
	@RequestMapping(value="/addpatient")
	public ModelAndView addPatient() {
		return new ModelAndView("addpatient");
	}
	
	@RequestMapping(value = "/savepatient", method = RequestMethod.POST)
	public ModelAndView saveEmploy(@ModelAttribute Patient patientNew) {
		System.out.println(patientNew);
	    patientList.add(patientNew);
	    return new ModelAndView("redirect:/showpatient");
	}
	
	@RequestMapping(value="/updatepatient")
	public ModelAndView updatePatient(HttpServletRequest request) {
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		Patient patientFound = null;
		for (Patient patient : patientList) {
			if (patient.getPatientId() == patientId) {
				patientFound = patient;
				break;
			}
		}
		return new ModelAndView("updatepatient","patient",patientFound);
	}
	
	@RequestMapping(value="/updatefinal",method=RequestMethod.POST)
	public ModelAndView updateFinal(@ModelAttribute Patient patientUpdated) {
		for (Patient patient : patientList) {
			if (patient.getPatientId() == patientUpdated.getPatientId()) {
				patient.setPatientName(patientUpdated.getPatientName());
				patient.setGender(patientUpdated.getGender());
				patient.setBillAmount(patientUpdated.getBillAmount());
				patient.setCity(patientUpdated.getCity());
				patient.setState(patientUpdated.getState());
				patient.setPolicyNumber(patientUpdated.getPolicyNumber());
				patient.setClaimAmount(patientUpdated.getClaimAmount());
				patient.setInsuranceName(patientUpdated.getInsuranceName());
				
				
				double pending=(patientUpdated.getBillAmount()!=0 || patientUpdated.getClaimAmount()!=0)?
						(patientUpdated.getBillAmount()-patientUpdated.getClaimAmount())
						:patient.getPendingAmount();
				patient.setPendingAmount(pending);
				break;
			}
		}
		return new ModelAndView("redirect:/showpatient");
	}
	
	@RequestMapping(value="/deletepatient")
	public ModelAndView deleteEmploy(HttpServletRequest request) {
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		Patient patientFound = null;
		for (Patient patient : patientList) {
			if (patient.getPatientId() == patientId) {
				patientFound = patient;
				break;
			}
		}
		patientList.remove(patientFound);
		return new ModelAndView("redirect:/showpatient");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
