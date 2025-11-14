package com.geeks.collection;
import java.util.*;
public class Set1 {
	public static void main(String[] args) {
		//Set.of is the factory method to create a immutable Set
		Set<Integer> x = Set.of(2,3,4,6,8);
		Set<Integer> y = Set.of(1,3,5,7,9);
		
		Set<Integer> union = new LinkedHashSet<Integer>();
		union.addAll(x);
		union.addAll(y);
		
		System.out.println("Union :"+union);
		
		Set<Integer> intersect = new LinkedHashSet<Integer>();
		intersect.addAll(x);
		intersect.retainAll(y);
		
		System.out.println("Intersection of x and y Common elements are retained :"+intersect);
		
		Set<Integer>  minus = new LinkedHashSet<Integer>();
		//elements in the x which are not there in y
		minus.addAll(x);
		minus.removeAll(y);
		
		System.out.println("minus :"+minus);
		
		List<Integer> unionall = new ArrayList<Integer>();
		unionall.addAll(x);
		unionall.addAll(y);
		
		System.out.println("Union with duplicates "+unionall);
		
		
		
	}

}
