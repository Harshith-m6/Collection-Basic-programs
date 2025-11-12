package com.geeks.collection;
import java.util.*;
public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet names = new TreeSet();
		names.add("harshith");
		names.add("abhi");
		names.add("pavan");
		names.add("harshi");
		names.add("pavu");
		//TreeMap internal DS
		//comparable method is used while sorting the objects 
		//-1 means adds to left hand side of the node +1 means adds at the right hand side of the node
		System.out.println(names);
	}

}
