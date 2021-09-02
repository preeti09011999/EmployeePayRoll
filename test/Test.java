package test;
import java.io.IOException;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.dao.impl.EmployeeInMemoryArrayDaoImpl;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.entity.Manager;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;
import com.hsbc.employeepayroll.factory.EmployeeDaoFactory;
import com.hsbc.employeepayroll.view.EmployeeView;
import com.hsbc.employeepayroll.view.View;

/**
 * 
 * @author preet
 * This class is responsible for deciding the flow of our application
 * Any communication between view and DAO has to happen through this class
 * NO DIRECT COMMUNICATION BETWEEN VIEW AND DAO
 * This class is acting as a "Controller"
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Manager manager = new Manager();
//		************************* Dynamic Polymorphism **********************************************
		
		Employee e = null;
//		Manager m = null;
		e = new Manager(1, "Preeti", 13, 34); // reference of super class can refer to object of 
		// its any of its sub class
		System.out.println(e.salary()); // salary will be of manager
		Manager manager = new Manager(1,"Preeti",13, 34);
		
		// Manager mg = new Employee(); => Not possible as sub class can never refer to object
		// of super-class
		//Employee emp = new Employee(12, "Preeti");
		
//	    *********************************************************************************************
		
//		System.out.println(manager);
		System.out.println(manager.salary());
//		System.out.println(emp);
		Object o = new Manager();
		System.out.println(o.toString()); // this will execute toString method of manager as 
//		object is of manager

//		*********************** Displaying the data stored in database ******************************
		
//		EmployeeInMemoryArrayDaoImpl dao = new EmployeeInMemoryArrayDaoImpl();
//		EmployeeDao dao = new EmployeeInMemoryArrayDaoImpl();
//		factory is a standard design pattern
		EmployeeDaoFactory factory = new EmployeeDaoFactory();
//		EmployeeDao dao = factory.getEmployeeDao();	//loosely coupled
//		dao.addEmployee(e);
		
		EmployeeDao dao;
		try {
			dao = factory.getEmployeeDao();
			dao.addEmployee(e);
			Employee[] employees = dao.findAllEmployee();
			View view = new EmployeeView();
			view.displayAllEmployees(employees);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		try {
//			dao.findEmployeeById(1);
//			View view = new EmployeeView();
//			view.displayAllEmployees(dao.findAllEmployee());
//		} catch (EmployeeNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		EmployeeView view = new EmployeeView();	// tightly coupled to a specific view => needs 
//		to be removed
		
//		*************** interfaces for loose coupling ************************************************
		
//		View view = new EmployeeView();
//		view.displayAllEmployees(dao.findAllEmployee());
		
//		**********************************************************************************************
		
//		for(Employee employee : dao.findAllEmployee()) {
//			System.out.println(employee);
//		}
		
//		**********************************************************************************************
		
//		new Employee(); // giving error => Employee is an abstract class which can't be instantiated
		
//		Employee emp = new Manager(1, "Preeti", 13, 34); // we can use reference of abstract class to
//		refer to any class
		
		
	}

}
