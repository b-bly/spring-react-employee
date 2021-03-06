package com.luv2code.springdemo.cruddemo.dao;

import java.util.List;

import com.luv2code.springdemo.cruddemo.entity.Employee;

public interface EmployeeDao {
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
}
