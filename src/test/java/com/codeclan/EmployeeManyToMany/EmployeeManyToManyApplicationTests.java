package com.codeclan.EmployeeManyToMany;

import com.codeclan.EmployeeManyToMany.models.Employee;
import com.codeclan.EmployeeManyToMany.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeManyToManyApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Susan", "Jones", "NE345");
		employeeRepository.save(employee);
	}

}
