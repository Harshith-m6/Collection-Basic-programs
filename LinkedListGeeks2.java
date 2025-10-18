package com.geeks.collection;

import java.util.LinkedList;

public class LinkedListGeeks2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Harshith");
		list.add("Pavan");
		list.add("Kushal");
		list.add("Chinthu");
		
		for(int i=0 ; i<list.size() ; i++) // size() returns the size of the list
		{
			System.out.println(list.get(i));
		}
		
		Object[] obj = list.toArray();  // toArray() method converts the list into Object array
		
		for(Object o : obj)
		{
			System.out.print(o+" ");
		}
	}

}
