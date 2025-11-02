package com.geeks.collection;
import java.util.*;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("pavan");
		hs.add("Harshith");
		hs.add("Harshith"); // does'nt allow duplicates
		hs.add("abhi");
		
		System.out.print(hs); // does'nt maintain insertion order
		System.out.println();
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("java");
		hs1.add("pyhton");
		hs1.add("Harshith");
		
		hs.removeAll(hs1); //difference bw two set
		System.out.println(hs);
		
		hs.add("Harshith");
		
		hs1.retainAll(hs); //intersection bw two set
		System.out.println(hs1); 

	}

}
