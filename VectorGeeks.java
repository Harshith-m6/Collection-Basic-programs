package com.geeks.collection;

import java.util.Vector;

public class VectorGeeks {
	public static void main(String[] args) {
		//default capacity of the vector will be 10 if elemetns increases then capacity increases by capacity*2
		Vector<String> v = new Vector<String>();
		v.addElement("harshith");
		
		v.add("pavan");
		
		System.out.println(v);
		
		Vector<String> v1 = new Vector<String>(2);
		System.out.println(v1.capacity()); // id the elements exceed by the initial capacity then the capacity will increase by capacoty*2
		
		v1.add("Java");
		v1.add("python");
		v1.add("c++");
//		v1.add("php");
//		v1.add("js");
		
		System.out.println(v1.capacity());
		
	
	}

}
