package com.capgemini.eis.pl;

import java.util.Scanner;

import com.capgemini.eis.bean.Employee;
import com.capgemini.eis.service.EmployeeService;
import com.capgemini.eis.service.EmployeeServiceImpl;

public class EmployeePresentation {
	static EmployeeService employeeService=new EmployeeServiceImpl();
	public static Employee inputDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Employee :");
		String name=sc.next();
		System.out.println("Enter id of employee :");
		int id=sc.nextInt();
		System.out.println("Enter Salary :");
		double salary=sc.nextDouble();
		System.out.println("Enter Designation :");
		String designation=sc.next();
		Employee employee=new Employee(id, name, salary, designation);
		return employee;
	}
	public static String insurance(Employee employee)
	{
		return employeeService.computeInsuranceScheme(employee);
	}
	public static void displayEmployeeDetails(Employee employee)
	{
		employeeService.display(employee);
	}
}
