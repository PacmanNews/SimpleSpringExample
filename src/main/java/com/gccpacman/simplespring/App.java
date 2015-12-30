package com.gccpacman.simplespring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gccpacman.simplespring.model.Employee;
import com.gccpacman.simplespring.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		Employee ee = new Employee();
		ee.setId("123");
		ee.setName("John");
		ee.setAge(22);
		EmployeeService emService = (EmployeeService)context.getBean("employeeService");
		emService.persistEmployee(ee);
		
		System.out.println("update age:" + emService.findEmployeeById("123").getAge());
		ee.setAge(24);
		emService.updateEmployee(ee);
		System.out.println("updated age:" + emService.findEmployeeById("123").getAge());
		emService.deleteEmployee(ee);
		context.close();
	}
}
