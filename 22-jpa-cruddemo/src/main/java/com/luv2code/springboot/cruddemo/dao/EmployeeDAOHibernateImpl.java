package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;
@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	// define entity manager 
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		
		//get current hibernate session
		Session currentSession=entityManager.unwrap(Session.class);
		
		//create a query
		Query<Employee> theQuery=currentSession.createQuery("from Employee",Employee.class);
		
		//execute query and get result
		List<Employee> employees=theQuery.getResultList();
		//return the result
		return employees;
	}
	@Override
	public Employee findById(int theId) {
		//current hibernate session 
		Session currentSession=entityManager.unwrap(Session.class);
		
		//get the employee
		Employee employee=currentSession.get(Employee.class,theId);
		
		//return employee
		return employee;
	}
	@Override
	public void save(Employee theEmployee) {
		
		//current hibernate session 
				Session currentSession=entityManager.unwrap(Session.class);
				
		//save the employee
				currentSession.saveOrUpdate(theEmployee);
				
	}
	@Override
	public void deleteById(int id) {
		
		//current hibernate session 
				Session currentSession=entityManager.unwrap(Session.class);
				
		//delete by primaryKey 
				Query theQuery=currentSession.createQuery("delete from employee where id:");
				
				theQuery.setParameter("EmployeeId", id);
		
				theQuery.executeUpdate();
	}

}
