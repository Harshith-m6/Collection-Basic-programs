package com.geeks.collection;

import java.util.LinkedList;

public class LinkedListGeeks {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("python");
		list.add("C");
		list.add("Java");
		list.add("C++");
		// we can access the elements in the LinkedList using for loop and get(index) method
		
		for(int i=0 ; i<list.size() ; i++) // size() returns the size of the list
		{
			System.out.println(list.get(i));
		}
		
		list.set(3, "C#");
		
		for(int i=0 ; i<list.size() ; i++) // size() returns the size of the list
		{
			System.out.println(list.get(i));
		}
		
		list.remove(); // remove first added element
		
		for(int i=0 ; i<list.size() ; i++) // size() returns the size of the list
		{
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		
		for(int i=0 ; i<list.size() ; i++) // size() returns the size of the list
		{
			System.out.println(list.get(i));
		}
	}

}
