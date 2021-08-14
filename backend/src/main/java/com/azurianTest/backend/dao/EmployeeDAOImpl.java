package com.azurianTest.backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.azurianTest.backend.entity.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	//Representa un contexto de persistencia
	@PersistenceContext
	private EntityManager em; 
	
	@Override
	public List<Employee> findAll() {

		//El manejador de entidades crea una consulta a la base de datos y la devuelve a la interface "TypedQuery
		TypedQuery<Employee> query = em.createQuery("from Employee order by name", Employee.class);
		//query.getResultList() devuelve la lista de empleado.
		return query.getResultList();

	}

}
