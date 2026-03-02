package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employ;

public interface EmployRepository extends JpaRepository<Employ, Integer>{
	List<Employ> findByGender(String gender);
	List<Employ> findByDept(String dept);
	List<Employ> findByDeptAndGender(String dept,String gender);
}
