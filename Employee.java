package com.geeks.collection;

public class Employee {
	
	String name ;
	Integer id;
	
	
	public Employee(String name, Integer id) {
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	

}
