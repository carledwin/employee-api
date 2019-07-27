package com.carledwinti.employee.api.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinti.employee.api.model.Employee;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeRestController {

	private List<Employee> employees = initialize();

	@GetMapping("/employees")
	public List<Employee> all(){
		
		return employees;
	}
	
	private List<Employee> initialize() {
		
		if(employees == null) {
			
			employees = new ArrayList<>();
			employees.add(new Employee("4343", "First employee", "Fulano de Tal", 5545.78d));
		}
		
		return employees;
	}
}
