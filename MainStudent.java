package com.geeks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {
	public static void main(String[] args) {
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("harshith",1));
		slist.add(new Student("Pavan",2));
		slist.add(new Student("abhi",4));
		
		Collections.sort(slist);
		
		System.out.println(slist);
		
		
	}

}
