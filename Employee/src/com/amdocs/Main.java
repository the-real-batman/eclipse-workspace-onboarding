package com.amdocs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address add = new Address("100","MG Road","Pune","411036");
		
		Employee sharma = new Employee("Sharma","Software Engineer","Digital",add);
		
		System.out.println(sharma.toString());

	}

}
