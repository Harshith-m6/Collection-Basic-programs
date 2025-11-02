package com.geeks.collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Harshith");
		al.add("Pavan");
		al.add("abhi");
		
		System.out.println(al);
		
		al.add(0,"harshi"); // elements at the current position will be move forward+1
		
		System.out.println(al);
		
		al.remove(1); //elements at the current position comes backward -1
		
		System.out.println(al);
		
		al.set(1,"pavan");
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.trimToSize();
		
		System.out.println(al.size());
	}

}
