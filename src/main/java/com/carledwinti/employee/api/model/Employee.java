package com.carledwinti.employee.api.model;

public class Employee {

	private String id;
	private String designation;
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(String id, String designation, String name, Double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
