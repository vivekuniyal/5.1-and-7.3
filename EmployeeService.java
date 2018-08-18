package com.capgemini.eis.service;

import com.capgemini.eis.bean.Employee;

public interface EmployeeService {
	String computeInsuranceScheme(Employee emp);
	void display(Employee employee);
}
