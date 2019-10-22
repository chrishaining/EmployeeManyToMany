package com.codeclan.EmployeeManyToMany;

import com.codeclan.EmployeeManyToMany.models.Department;
import com.codeclan.EmployeeManyToMany.models.Employee;
import com.codeclan.EmployeeManyToMany.repositories.DepartmentRepository;
import com.codeclan.EmployeeManyToMany.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeManyToManyApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("HR");
		Employee employee = new Employee("Susan", "Jones", "NE345", department);
		departmentRepository.save(department);
		employeeRepository.save(employee);
	}

}
