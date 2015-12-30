package com.gccpacman.simplespring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gccpacman.simplespring.dao.EmployeeDAO;
import com.gccpacman.simplespring.model.Employee;
import com.gccpacman.simplespring.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@Transactional
	public void persistEmployee(Employee employee){
		employeeDAO.persistEmployee(employee);
	}
	
	@Transactional
	public void updateEmployee(Employee employee){
		employeeDAO.updateEmployee(employee);
	}
	
	@Transactional
	public Employee findEmployeeById(String id){
		return employeeDAO.findEmployeeById(id);
	}
	
	@Transactional
	public void deleteEmployee(Employee employee){
		employeeDAO.deleteEmployee(employee);
	}
	
}
