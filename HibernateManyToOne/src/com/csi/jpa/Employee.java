package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue
	
	private int empId;
	
	private String empName;
	
	private double empSalary;
	
	@ManyToOne
	private Address address;

	public Employee(String empName, double empSalary, Address address) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}
	
}
