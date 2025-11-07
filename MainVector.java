package com.geeks.collection;

import java.util.Vector;

public class MainVector {
	public static void main(String[] args) {
		//linkedlist from jdk - 1.2
		//Collection api from jdk 1.2
		//vector available from jdk 1.0 version -created at 1994 modified at 2019
		Vector<String> names = new Vector<String>();
		//creates an empty Vector object with capacity of 10 in heap area
		//they are index based 
		//length is 10 but size is zero and reffered by variable names
		names.add("Harshith");
		names.add("Pavan");//string is written in literal way object is created string constant pool
		names.add("Abhi");
		names.add("kushal");
		
		System.out.println(names);
		System.out.println(names.size()); // number of elements present in the vector
		System.out.println(names.capacity()); // initial capacity 
		
		names.add("Lohith");
		names.add("Raghu");
		names.add("madhu");
		names.add("Mahesh");
		names.add("Adish");
		names.add("Kushwik");
		names.add("Akash");
		
		System.out.println(names.capacity());  // capacity increases by 2x(current capacity)
		
		
		
	}

}
