package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.SbJdbcExceptionApplication;
import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@RestController
@RequestMapping(value="/employ")
public class EmployController {

	@Autowired
	private EmployService employService;
	
//  http://localhost:9002/employ/showByGender/FEMALE	
	@GetMapping(value="/showByGender/{gender}")
	public ResponseEntity<List<Employ>> showByGender(@PathVariable String gender){
		return ResponseEntity.ok(employService.showByGender(gender));
	}
	
//  http://localhost:9002/employ/showByDept/Java	
	@GetMapping(value="/showByDept/{dept}")
	public ResponseEntity<List<Employ>> showByDept(@PathVariable String dept){
		return ResponseEntity.ok(employService.showByDept(dept));
	}
	
//  http://localhost:9002/employ/showByGender/Java/Female
	@GetMapping(value="/showByDeptAndGender/{dept}/{gender}")
	public ResponseEntity<List<Employ>> showByDeptAndGender(@PathVariable String dept,
			@PathVariable String gender){
		return ResponseEntity.ok(employService.showByDeptAndGender(dept, gender));
	}
	
	@GetMapping("/showemploy")
	public ResponseEntity<List<Employ>> showEmploy(){
		return ResponseEntity.ok(employService.showEmploy());
	}
	
	@GetMapping("/searchemploy/{empno}")
	public ResponseEntity<Employ> searchEmploy(@PathVariable int empno){
		return ResponseEntity.ok(employService.searchEmploy(empno));
	}
	
	@PostMapping("/addemploy")
	public ResponseEntity<String> addEmploy(@RequestBody Employ employ){
		String saved=employService.addEmploy(employ);
		return new ResponseEntity<>(saved,HttpStatus.CREATED);
	}
	
	@PutMapping("/updateemploy")
	public ResponseEntity<String> updateEmploy(@RequestBody Employ employ){
		String updated=employService.updateEmploy(employ);
		return ResponseEntity.ok(updated);
	}
	
	@DeleteMapping("/deleteemploy/{empno}")
	public ResponseEntity<String> deleteEmploy(@PathVariable int empno){
		return ResponseEntity.ok(employService.deleteEmploy(empno));
	}
}
