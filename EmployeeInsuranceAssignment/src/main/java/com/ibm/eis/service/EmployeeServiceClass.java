package com.ibm.eis.service;

import java.util.ArrayList;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.EmployeeDaoClass;

public class EmployeeServiceClass implements EmployeeServiceInterface{
		EmployeeDaoClass dao= new EmployeeDaoClass();
		@Override
		public void getEmployeeDetails(Employee emp) {
		 dao.getEmployeeDetails(emp);
	 }
		@Override
		public Employee insurance(Employee emp) {
		 return dao.insurance(emp);
	 }
		@Override
		public ArrayList<Employee> display(){
		 return dao.display();
	 }
}
