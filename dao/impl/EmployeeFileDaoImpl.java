package com.hsbc.employeepayroll.dao.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public class EmployeeFileDaoImpl implements EmployeeDao {

	private final String FILE_PATH = "C:\\Users\\preet\\eclipse-workspace\\EmployeePayroll\\Emp.txt";
	private ObjectInputStream ois = null;	//this class is capable of reading object from a file
	private ObjectOutputStream oos = null;	// this class is capable of writing object to a file
	private FileInputStream fis = null;
	private FileOutputStream fos = null;
	
	public EmployeeFileDaoImpl() throws IOException{
		fos = new FileOutputStream(FILE_PATH);
		fis = new FileInputStream(FILE_PATH);
		oos = new ObjectOutputStream(fos);
		ois = new ObjectInputStream(fis);
	}
	
	@Override
	public Employee[] findAllEmployee() {
		// TODO Auto-generated method stub\
		Employee[] employees = new Employee[2];
		try {
			Employee e = (Employee) ois.readObject(); // this will read object from file associated with ois reference
			employees[1] = e;
			return employees;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			oos.writeObject(employee);	// write object is a method of ObjectOutputStream which writes object to file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
