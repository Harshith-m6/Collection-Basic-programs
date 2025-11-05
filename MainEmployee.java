package com.geeks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEmployee implements Comparator<Employee>{
	public static void main(String[] args) {
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("harshith",1));
		elist.add(new Employee("pavan",2));
		elist.add(new Employee("abhi",3));
		Collections.sort(elist , new MainEmployee());
		
		System.out.println("Soretd based on the given conditions : "+elist);
		
	}

//	@Override
//	public int compare(Employee e1 , Employee e2) {
//		return e1.id.compareTo(e2.id);
//	}
	
	@Override
	public int compare(Employee e , Employee a)
	{
		return e.name.compareTo(a.name);
	}
	


}

