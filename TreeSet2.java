package com.geeks.collection;

public class TreeSet2 {
	public static void main(String[] args) {
		Integer i1 = 66;
		Integer i2 = 56;
		
		System.out.println(i1.compareTo(i2));
		System.out.println(i2.compareTo(i1));
		System.out.println(i1.compareTo(i1)); // compres by difference in the values
		
		String x = "Ramesh";
		String y = "Suresh"; //Ascii value of S is greater than R so S>R
		
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x)); //lexographical order (dictonary) using Unicode
		System.out.println(x.compareTo(x));
		
		//compareTo compares the this (current) object with the given object and returns -1 , 1 , 0 based on the 
		
	}

}
