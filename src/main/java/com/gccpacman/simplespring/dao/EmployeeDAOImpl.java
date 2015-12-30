package com.gccpacman.simplespring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gccpacman.simplespring.model.Employee;
import com.gccpacman.simplespring.dao.EmployeeDAO;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void persistEmployee(Employee employee) {
        sessionFactory.getCurrentSession().persist(employee);
    }

    public Employee findEmployeeById(String id){
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    public void updateEmployee(Employee employee){
        sessionFactory.getCurrentSession().update(employee);
    }

    public void deleteEmployee(Employee employee){
        sessionFactory.getCurrentSession().delete(employee);
    }
}
