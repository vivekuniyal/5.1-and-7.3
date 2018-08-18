package com.capgemini.eis.bean;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public Employee(int id, String name, double salary, String designation) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		
	}
	@Override
	public String toString() {
		return "Employee [id is " + id + ", name is " + name + ", salary is " + salary + ", designation is "
				+ designation + ", insuranceScheme is " + insuranceScheme + "]\n";
	}
	@Override
	public int compareTo(Employee emp) {

		if(this.id<emp.id)
			return -1;
		else if(this.id>emp.id)
			return 1;
		else 
			return 0;
	}
	
	

}
