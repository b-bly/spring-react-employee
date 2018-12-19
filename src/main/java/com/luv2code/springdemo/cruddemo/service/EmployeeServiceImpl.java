package com.luv2code.springdemo.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.cruddemo.dao.EmployeeDao;
import com.luv2code.springdemo.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao theEmployeeDao) {
		employeeDao = theEmployeeDao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDao.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(theId);
	}

}
