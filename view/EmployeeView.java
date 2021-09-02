package com.hsbc.employeepayroll.view;

import com.hsbc.employeepayroll.entity.Employee;
/**
 * 
 * @author preet
 * The purpose of this class is to display all the details of Employees in user friendly format
 * The class is Playing the role of "VIEW Layer"
 * 
 */
public class EmployeeView implements View{
	
	@Override
	public void displayAllEmployees(Employee[] employees) {
		System.out.println("---------------------");
		System.out.println("Id \t Name \t Salary");
		System.out.println("---------------------");
		for(Employee employee : employees) {
			if(employee != null) {
				System.out.println(employee.getEmployeeId() + " " + employee.getName() + " " + employee.getSalary());
			}
		}
	}
	
	public void acceptEmployeeDetails() {
//		accepting the data from user => return an Employee Object => test class will add the object to db
	}
}
