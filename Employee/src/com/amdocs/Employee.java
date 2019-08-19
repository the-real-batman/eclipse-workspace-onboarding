package com.amdocs;

public class Employee {
	
	private String name;
	private String designation;
	private String department;
	
	private Address address = new Address();

	public String getName() {
		return name;
	}

	public Employee(String name, String designation, String department, Address address) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", department=" + department + ", address="
				+ address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
