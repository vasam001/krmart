package com.example.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesApplication {

	public static void main(String[] args) {
		System.out.println("-----------start----------");
		SpringApplication.run(EmployeesApplication.class, args);
		System.out.println("-----------running successfully----------");
	}

}
