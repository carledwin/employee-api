package com.carledwinti.employee.api.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carledwinti.employee.api.model.Employee;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

	private List<Employee> employees = initialize();

	@GetMapping
	public List<Employee> all(){
		
		return employees;
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id) {
		
		for(Employee employee : employees)
			
			if(employee.getId() == id) {
				employees.remove(employee);
				return true;
			}
		
		return false;
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee employee){
		
		employees.add(employee);
		return employee;
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		
		if(employees.contains(employee)) {
			
			for(Employee employeeUpdate : employees) {
				
				if(employeeUpdate.getId().equals(employee.getId())){
					
					employeeUpdate = employee;
					return employeeUpdate;
				}
			}
		}
		
		return null;
	}
	
	private List<Employee> initialize() {
		
		if(employees == null) {
			
			employees = new ArrayList<>();
			employees.add(new Employee(0, "First employee", "Fulano de Tal", 5545.78d));
		}
		
		return employees;
	}
}
