package com.jsp.Jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer empid;

	private String dob;

	private String empdepartment;

	private String empname;

	private double empsalary;

	private String mob;

	public Employee() {
	}

	public int getEmpid() {
		return this.empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmpdepartment() {
		return this.empdepartment;
	}

	public void setEmpdepartment(String empdepartment) {
		this.empdepartment = empdepartment;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsalary() {
		return this.empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public String getMob() {
		return this.mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

}