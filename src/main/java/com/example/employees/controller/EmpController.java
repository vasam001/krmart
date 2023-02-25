package com.example.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employees.model.Empdetails;
import com.example.employees.repository.EmpRepository;

@RestController
@RequestMapping("/employees")
public class EmpController {
	@Autowired
	public EmpRepository repos;

	@PostMapping("/empdata")
	public String empdata(@RequestBody Empdetails empdetails) {
		repos.save(empdetails);
		return "Employee saved";
	}

	@GetMapping("/getemp")
	public List<Empdetails> getemp() {
		return repos.findAll();

	}
}
