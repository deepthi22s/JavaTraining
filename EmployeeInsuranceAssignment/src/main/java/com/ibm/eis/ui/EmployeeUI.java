package com.ibm.eis.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeServiceClass;
import com.ibm.eis.service.EmployeeServiceInterface;

public class EmployeeUI {
	Scanner scan= new Scanner(System.in);
	EmployeeServiceInterface service= new EmployeeServiceClass();
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		while(true) {
		System.out.println("Enter your Choice");
		System.out.println("1. Enter Employee Details \n2. Which Insurance Scheme is Applicable \n3. Display all Details\n4.Exit");
		int choice= scan.nextInt();
		scan.nextLine();
		new EmployeeUI().choice(choice);
		}
	}
	void choice(int ch) {
		switch(ch) {
		case 1: entry(); break;
		case 2: insurance(); break;
		case 3: display(); break;
		case 4: System.exit(0);
		}
	}
	void entry() {
		System.out.println("Enter Details");
		System.out.println("1.ID \n2.Name\n3.Salary\n4.Designation");
		int id= scan.nextInt(); scan.nextLine();
		String name=scan.nextLine();
		int salary=scan.nextInt(); scan.nextLine();
		String designation=scan.nextLine();
		

		service.getEmployeeDetails(new Employee(id,name,salary,designation));
	}
	void insurance() {
		System.out.println("Enter the Designation ");
		Employee emp= service.insurance(new Employee(scan.nextLine()));
		System.out.println("The Medical Scheme type is"+emp.getInsuranceScheme());
		
	}
	void display() {
		System.out.println("The content of the file are:");
		ArrayList<Employee> list= service.display();
				for(Employee i: list) {
					System.out.println(i);
				}
	}
}
