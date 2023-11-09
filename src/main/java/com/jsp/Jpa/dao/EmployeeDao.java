  package com.jsp.Jpa.dao;

import com.jsp.Jpa.entity.Employee;

public interface EmployeeDao
{
  void insertdata(Employee emp);
  Employee fetchdatabyId(int id);
  void deletedatabyId(int id);
}
