package com.ibm.eis.service;

import java.util.ArrayList;

import com.ibm.eis.bean.Employee;

public interface EmployeeServiceInterface {
	void getEmployeeDetails(Employee emp);
	Employee insurance(Employee emp);
	ArrayList<Employee> display();
	void choice(int choice);
}
