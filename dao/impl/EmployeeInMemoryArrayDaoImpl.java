package com.hsbc.employeepayroll.dao.impl;	// data access object
import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;
// dao is a standard pattern which is used to talk to 
// underlying datastore ( it can be database, or it can be in memory)

public class EmployeeInMemoryArrayDaoImpl implements EmployeeDao{
	
	private Employee employees[];
	private static int idx;
	
	public EmployeeInMemoryArrayDaoImpl() {
		employees = new Employee[2];
		idx = 0;
	}
	
	public void addEmployee(Employee e) {
		if(idx == employees.length) return;
		employees[idx++] = e;
		System.out.println("Employee added");
	}
	
	public Employee[] findAllEmployee() {
		return this.employees;
	}

//	*************************** Throwing custom exception ************************************************************
	
	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		for(Employee findEmployee : employees) {
			if(findEmployee != null && findEmployee.getEmployeeId() == id) {
				System.out.println("employee found");
				return findEmployee;
			}
		}
//		throwing a custom exception
		throw new EmployeeNotFoundException(); // Additional checked exception(not present in super) in
//		overridden method is not allowed, this can be done by adding the throws clause in the 
//		interface whose method is overridden here
		
//		Overridden methods can't declare newer or broader checked exception
//		return null;
	}
	
//	********************************************************************************************************************
	
}
