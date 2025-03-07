package com.practice;

import java.util.ArrayList;
import java.util.List;

class Employee {

	int id;
	String name;
	double salary;

	// Constructor to initialize the Employee object
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Method to display employee details
	public void displayDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
		System.out.println(); // Empty line for better readability
	}
}

// Main class with the main method to run the program
public class EmployeeApp {
	public static void main(String[] args) {
		// Creating employee objects
		Employee emp1 = new Employee(1, "John Doe", 50000.0);
		Employee emp2 = new Employee(2, "Jane Smith", 60000.0);
		Employee emp3 = new Employee(3, "Sam Wilson", 45000.0);

		// Storing employees in a list
		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		// Displaying details of all employees in the list
		for (Employee emp : employees) {
			emp.displayDetails();
		}
	}
}
