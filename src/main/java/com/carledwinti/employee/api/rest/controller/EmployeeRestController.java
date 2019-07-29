package com.carledwinti.employee.api.rest.controller;

import java.util.ArrayList;
import java.util.List;

import com.carledwinti.employee.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

	private List<Employee> employees = null;

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping
	public List<Employee> all(){
		return employeeRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id) {

		employeeRepository.delete(id);
		return !employeeRepository.exists(id);
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee employee){
		return employeeRepository.save(employee);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
}
