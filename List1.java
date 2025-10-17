package com.geeks.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		//we must create object for the List using its subclasses only
		List<String> list = new ArrayList<String>();
		list.add("python");
		list.add("java");
		list.add("C++");
		list.add("C#");
		
		for(String lang : list)
		{
			System.out.println(lang);
		}
		
		System.out.println(list.remove(0));
		System.out.println(list.remove("C#"));  //since String is Wrapper class and Collection stores elements as objects we should pass object
		System.out.println(list);
		
		list.set(1, "PHP");
		System.out.println(list);// set() can only replace the existing elements
		list.add("python");
		list.add("DOT");
		System.out.println(list); // add() can dynamically add the elements to the list
	}

}
