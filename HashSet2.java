package com.geeks.collection;
import java.util.*;


public class HashSet2 {
	public static void main(String[] args) {
		HashSet values = new HashSet();
		values.add(12);
		values.add(22);
		values.add(20); //auto boxing from int to Integer
		System.out.println(values.add(20)); // returns false if we try to add dupicate not error
		System.out.println(values.add(10.35));
		values.add("Harshith");
		System.out.println(values);
		// hashset maintains uniqueness by maintating the hascode
		//hashset generates the hashcode for the objects by creating hashcode for the object
		
		//stores the unique elements only
		//doesnt mainatain insertion order or sorting order
		//only one null
		//hashset maintains uniqueness by generation hascode for the object based on the values if two elements having same hascode collision happens
		//not synchrinised
		//initial capacity = 16 , load factor = 0.75
		// duplocates are checked using equals method
		//hashcode and equals methods are overriden to mainatain the uniqueness
	}

}
