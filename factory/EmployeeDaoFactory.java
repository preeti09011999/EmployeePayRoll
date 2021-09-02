package com.hsbc.employeepayroll.factory;

import java.io.IOException;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.dao.impl.EmployeeFileDaoImpl;

public class EmployeeDaoFactory {
	public EmployeeDao getEmployeeDao() throws IOException {
//		EmployeeInMemoryDaoImpl dao = new EmployeeInMemoryDaoImpl();
		EmployeeFileDaoImpl dao = new EmployeeFileDaoImpl();
		return dao;
	}
}
