package com.capgemini.eis.service;

import com.capgemini.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String computeInsuranceScheme(Employee emp) {
		if((emp.getSalary()>5000 && emp.getSalary()<20000) && (emp.getDesignation().equalsIgnoreCase("System Associate")))
		{
			return "Scheme C";
		}
		else if((emp.getSalary()>=20000 && emp.getSalary()<40000) && (emp.getDesignation().equalsIgnoreCase("Programmer")))
		{
			return "Scheme B";
			 
		}
		else if((emp.getSalary()>=40000) && (emp.getDesignation().equalsIgnoreCase("Manager")))
		{
			return "Scheme A";
		}
		else if(emp.getSalary()<5000 && emp.getDesignation().equals("Clerk"))
			return "No Scheme";
		return "No Scheme";
	}

	@Override
	public void display(Employee employee) {
		System.out.println(employee);
	}

}
