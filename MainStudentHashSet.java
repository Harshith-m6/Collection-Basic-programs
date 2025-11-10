package com.geeks.collection;
import java.util.*;
public class MainStudentHashSet {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(new StudentHashSet(101,"Harshith",99.00));
		hs.add(new StudentHashSet(102,"Pavan",99.00));
		hs.add(new StudentHashSet(103,"Harshith",94.00));
		hs.add(new StudentHashSet(104,"Abhi",94.00));
		hs.add(new StudentHashSet(104,"Abhi",94.00));
		
	Iterator itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	}

}
