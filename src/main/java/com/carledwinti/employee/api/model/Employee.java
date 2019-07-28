package com.carledwinti.employee.api.model;

public class Employee {

	private Integer id;
	private String designation;
	private String firstName;
	private Double salary;
	
	public Employee() {
	}

	public Employee(Integer id, String designation, String firstName, Double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.firstName = firstName;
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
	
}
