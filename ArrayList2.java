package com.geeks.collection;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		
		System.out.println(a2);
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		
		a3.add(5);
		a3.add(6);
		a3.add(1);
		
		System.out.println(a3);
		
		a1.retainAll(a3); //retains only similar objects
		
		System.out.println(a1);
		
		a1.removeAll(a3); // remove the Objects that are similar in both
		
		System.out.println(a1);
		
		
	}

}
