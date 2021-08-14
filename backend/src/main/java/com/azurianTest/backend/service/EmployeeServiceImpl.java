package com.azurianTest.backend.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.azurianTest.backend.dao.EmployeeDAO;
import com.azurianTest.backend.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public List<Employee> findAll() {
		//Devuelve la lista de empleados desde el repositorio
		return employeeDAO.findAll();
	}

}
