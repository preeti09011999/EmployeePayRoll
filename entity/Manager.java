package com.hsbc.employeepayroll.entity;
/**
 * 
 * @author preet
 * This class contains all the information and methods related to Manager
 *
 */
public class Manager extends Employee {
	private int numberOfProjects;
	
	public Manager() {
//		super();
		this(1,"",1,1); // this will call parameterized constructor of same class
		System.out.println(" in manager");
	}
	public Manager(int id, String name, int salary, int numberOfProjects) {
//		super(); // this will call no argument constructor of immediate super class
		super(id, name, salary); // this will call parameterized argument constructor of immediate super class
		System.out.println(" in manager parameterized");
		this.numberOfProjects = numberOfProjects;
	}
	
	@Override
	public int salary() {
		return super.getSalary() * numberOfProjects;
	}
	
	@Override
	public String toString() {
		return this.numberOfProjects + super.toString();
	}
}
