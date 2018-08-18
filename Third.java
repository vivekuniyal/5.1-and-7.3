package com.capgemini.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.eis.bean.Employee;
import com.capgemini.eis.pl.EmployeePresentation;

public class Third {
	static HashMap<String,Employee> employeeList=new HashMap<String,Employee>();
	public static void addEmployee(Employee employee)	{
		//code to add employee
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter insurance scheme");
		String insuranceScheme=sc.next();
		employee.setInsuranceScheme(insuranceScheme);
		employeeList.put(insuranceScheme, employee);
		
}

	public static boolean deleteEmployee(int id)	{
//	     code to delete a employee whose id is passed as parameter
		
		Employee toDelete=null;
		int flag=0;
		Collection<Employee> values=employeeList.values();
		for(Employee emp:values)
		{
			if(emp.getId()==id)
			{
				toDelete=emp;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			employeeList.remove(toDelete.getInsuranceScheme(), toDelete);
			return true;
		}
		else
			return false;
		
		
		
	}

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total no. of products :");
	int total=sc.nextInt();
		Employee employee=null;
		
		for(int i=0;i<total;i++)
		{
			employee =EmployeePresentation.inputDetails();
			addEmployee(employee);
		}
		Collection<Employee> values=employeeList.values();
		List mylist=new ArrayList<>(values);
		Collections.sort(mylist);
		System.out.println(employeeList);
		System.out.println(mylist);
		System.out.println("Enter Id to delete ");
		int id=sc.nextInt();
		System.out.println(deleteEmployee(id));
		System.out.println(employeeList);	
	}

}
