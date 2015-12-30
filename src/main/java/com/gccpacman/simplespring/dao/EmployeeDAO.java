package com.gccpacman.simplespring.dao;

import com.gccpacman.simplespring.model.Employee;

public interface EmployeeDAO{

    void persistEmployee(Employee employee);

    Employee findEmployeeById(String id);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
