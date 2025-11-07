package com.geeks.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatotLambda {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Harshith", "pavan" , "abhi");
		
		Collections.sort(names , (a,b) -> a.compareTo(b));
		
		System.out.println(names);
	}

}
