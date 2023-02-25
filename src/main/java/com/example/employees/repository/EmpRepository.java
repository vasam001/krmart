package com.example.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.employees.model.Empdetails;

public interface EmpRepository extends JpaRepositoryImplementation<Empdetails, Integer> {

}
