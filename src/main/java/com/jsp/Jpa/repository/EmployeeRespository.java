package com.jsp.Jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Jpa.entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
