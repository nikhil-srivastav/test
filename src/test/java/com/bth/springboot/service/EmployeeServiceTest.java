package com.bth.springboot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.bth.springboot.model.Employee;

@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void TestSaveEmployee() {
		Employee employee = new Employee();
		employeeService.saveEmployee(employee);
		Assert.notEmpty(employeeService.getAllEmployees());
		
	}
}
