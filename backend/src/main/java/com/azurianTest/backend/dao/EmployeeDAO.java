package com.azurianTest.backend.dao;

import java.util.List;

import com.azurianTest.backend.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();

}
