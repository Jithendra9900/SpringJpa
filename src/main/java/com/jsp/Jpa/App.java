package com.jsp.Jpa;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Jpa.config.Configuration;
import com.jsp.Jpa.dao.EmployeeDao;
import com.jsp.Jpa.dao.Employeedaoimpl;
import com.jsp.Jpa.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
       EmployeeDao dao=context.getBean("daoimpl", Employeedaoimpl.class);
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 1 for insert the data");
       System.out.println("Enter 2 for delete the data");
       Employee e=new Employee();
       int choice=sc.nextInt();
       switch(choice)
       {
       case 1:
       {
    	   System.out.println("Enter Emp Id");
    	   e.setEmpid(sc.nextInt());
    	   System.out.println("Enter Emp Name");
    	   e.setEmpname(sc.next());
    	   System.out.println("Enter Emp salary");
    	   e.setEmpsalary(sc.nextDouble());
    	   System.out.println("Enter Emp Dept");
    	   e.setEmpdepartment(sc.next());
    	   System.out.println("Enter Emp Dob");
    	   e.setDob(sc.next());
    	   System.out.println("Enter Emp Mobile");
    	   e.setMob(sc.next());
    	   dao.insertdata(e);
    	   System.out.println("Data Inserted...!!!");
    	   
    	   break;
       }
       case 2:
       {
    	   System.out.println("Enter emp Id");
    	   dao.deletedatabyId(sc.nextInt());
    	   System.out.println("Deleted...!!");
    	   break;
       }
       
       
       }
    }
}
