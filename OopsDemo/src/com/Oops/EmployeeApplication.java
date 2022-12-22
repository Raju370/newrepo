package com.Oops;

import java.util.Scanner;

class Employee {

	// state of object
	int empId;
	String empName;
	Double salary;

	// behavior of the object
	public void initializeEmployee(int empId, String empName, Double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}// endOfinitializeEmployee

	public void displayEmployee() {
		System.out.println("employeeId is :" + empId);
		System.out.println("employeeName is :" + empName);
		System.out.println("employeeSalary is :" + salary);
	}// endOfDisplayEmployee

	public void empId(int i) {
		// TODO Auto-generated method stub

	}

}// endOfTheClass

public class EmployeeApplication {

	public static void main(String[] args) {

		// employee e1 created
		Employee e1 = new Employee();
		e1.initializeEmployee(505, "Ramana", 49500.87);
		System.out.println("Employee one Details");
		e1.displayEmployee();
		System.out.println("***************************************");

		// employee e2 created
		Employee e2 = new Employee();
		e2.initializeEmployee(200, "Phani", 100000.00);
		System.out.println("Employee two Details");
		e2.displayEmployee();

	}

}
