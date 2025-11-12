package com.geeks.collection;
import java.util.*;
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet();
		ts.add("Harshith");
		ts.add("Pavan");
		ts.add("abhi");
//		ts.add(null); nullPointerException
		ts.add("Abhi");
		// sorted internally in ascending order
		System.out.println(ts);
		// DS red black tree
		// SortedSet , NavigableSet and set
		
	}

}
