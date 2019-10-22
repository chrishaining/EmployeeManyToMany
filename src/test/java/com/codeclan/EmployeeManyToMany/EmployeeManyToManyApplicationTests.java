package com.codeclan.EmployeeManyToMany;

import com.codeclan.EmployeeManyToMany.models.Department;
import com.codeclan.EmployeeManyToMany.models.Employee;
import com.codeclan.EmployeeManyToMany.models.Project;
import com.codeclan.EmployeeManyToMany.repositories.DepartmentRepository;
import com.codeclan.EmployeeManyToMany.repositories.EmployeeRepository;
import com.codeclan.EmployeeManyToMany.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeManyToManyApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartmentAndProjet() {

		Project project1 = new Project("Personal Training", 3);
		Project project2 = new Project("Personal Training", 3);
		Department department = new Department("HR");
		Employee employee1 = new Employee("Susan", "Jones", "NE345", department);

		projectRepository.save(project1);
		departmentRepository.save(department);
		employeeRepository.save(employee1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}

}
