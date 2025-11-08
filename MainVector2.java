package com.geeks.collection;
import java.util.*;
public class MainVector2 {
	public static void main(String[] args) {
		Vector<String> names = new Vector<>(5);
		names.add("Harshith");
		names.add("pavan");
		names.add("Abhi");
		names.add("harshi");
		names.add("Pavu");
		names.add("raghu");
		//enumeration is a legacy cursor available for only vector (enum is different
		System.out.println(names.size());
		System.out.println(names.capacity());
		
		Enumeration<String> em = names.elements(); //by calling the elements(Factory method for enumeration) we can create the object
		
		while(em.hasMoreElements())  // if next element is present  true else false
		{
			System.out.println(em.nextElement());
		}
		
		//from jdk 1.0 legacy cursor for the vector  , its only traverse in the forward direction
		//factory methods are the methods which creates the objects for the Interfaces
		
		//listiterator is the factory method for ListIterator
	}

}
