package com.geeks.collection;
import java.util.*;
public class LinkedHashSet1 {
	public static void main(String[] args) {
		//LinkedHashSet is a child class of hashSet
		LinkedHashSet values = new LinkedHashSet();
		values.add(12);
		values.add(33);
		values.add(80);
		values.add(90);
		
		System.out.println(values);
		//Maintain Insertion Order
		// combination of doublyLinkedKist and HashTable is the UnderLying data Structure
		
	}

}
