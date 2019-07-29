package com.carledwinti.employee.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {

	@Id
	private Integer id;
	private String designation;
	private String firstName;
	@Indexed(unique=true)
	private String email;
	private Double salary;
	
	public Employee() {
	}

	public Employee(Integer id, String designation, String firstName, String email, Double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.firstName = firstName;
		this.email = email;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }
	
}
