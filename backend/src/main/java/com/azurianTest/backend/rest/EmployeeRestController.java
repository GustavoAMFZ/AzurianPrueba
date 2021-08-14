package com.azurianTest.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azurianTest.backend.entity.Employee;
import com.azurianTest.backend.service.EmployeeService;

//Permite que se puedan solicitar recursos desde otro dominio, en este caso por "http://localhost:4200/"
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		/*Devuelve la lista de empleados desde el "EmployeeService" y la url es recuperada en formato JSON, 
		en este caso por el frontend de Angular*/
		return employeeService.findAll();
	}
}

