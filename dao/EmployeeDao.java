package com.hsbc.employeepayroll.dao;

import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	Employee[] findAllEmployee();
	void addEmployee(Employee employee);
	Employee findEmployeeById(int id) throws EmployeeNotFoundException;
}
