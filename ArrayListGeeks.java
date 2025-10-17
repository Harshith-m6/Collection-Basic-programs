package com.geeks.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeeks {
	public static void main(String[] args) {
		List<String> s = new ArrayList();
		s.add("harshith");
		s.add("pavan");
		s.add("abhi");
		
		for(String name : s)
		{
			System.out.println(name);
		}
	}

}
