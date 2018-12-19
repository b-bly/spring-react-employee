package com.luv2code.springdemo.cruddemo.service;

import java.util.List;

import com.luv2code.springdemo.cruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
}
