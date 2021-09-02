package com.hsbc.employeepayroll.entity;

import java.io.Serializable;

/**
 * 
 * @author preet
 * This class contains all the information and methods related to Employee
 *
 */
abstract public class Employee implements Serializable {
	
	private int id;
	private String name;
	private int salary;
	private static int counter;
	public Employee() {
//		super();
		System.out.println(" in employee ");
		counter++;
	}
	public Employee(int id, String name, int salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println(" parametrized constructor of employee");
	}
	
	@Override
	public String toString() {
		return " " + this.id + " " + this.name ;
	}
	
	public abstract int salary();
	
	public int getEmployeeId() {
		return this.id;
	}
	
	public void setEmployeeId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int noOfEmployees() {
		return counter;
	}
	
}
