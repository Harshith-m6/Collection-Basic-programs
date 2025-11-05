package com.geeks.collection;

public class Student implements Comparable<Student>{

	String name ;
	int id ;
	
	Student(String name , int id)
	{
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	

}
