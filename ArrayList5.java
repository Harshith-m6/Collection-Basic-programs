package com.geeks.collection;
import java.util.*;

public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Harshith");
		al.add("Pavan");
		al.add("abhi");
		
		al.add(3, "kuhsi");
		
		System.out.print(al);
		
		al.remove(0);
		System.out.print(al); //rmv at specific index
		
		al.remove("Pavan");
		
		System.out.println(al); //remove particular element
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("pavan");
		al2.add("harshith");
		
		System.out.println(al2);
		
		al2.addAll(al);
		System.out.println(al2);
		
		Collections.sort(al2);
		System.out.println(al2);
		
		Collections.sort(al2 , Collections.reverseOrder());
		
		System.out.println(al2);
	}

}
