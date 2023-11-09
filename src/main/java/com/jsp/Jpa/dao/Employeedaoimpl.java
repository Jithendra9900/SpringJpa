package com.jsp.Jpa.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Jpa.entity.Employee;
import com.jsp.Jpa.repository.EmployeeRespository;
@Component("daoimpl")
public class Employeedaoimpl implements EmployeeDao {

	@Autowired
	private EmployeeRespository repo;
	public void insertdata(Employee emp)
	{
		repo.save(emp);
		
  
	}
	public Employee fetchdatabyId(int id) {
		Optional<Employee> opt=repo.findById(id);
		if (opt!=null)
		{
			
		}
		return null;
	}
	public void deletedatabyId(int id) 
	{
	  repo.deleteById(id);
		
	}

}
