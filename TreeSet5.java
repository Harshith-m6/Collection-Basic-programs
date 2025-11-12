package com.geeks.collection;
import java.util.*;
public class TreeSet5 {
	public static void main(String[] args) {
		
		//comparator functional interface , takes two objects as arguments , used to customize the sorting
		//anonymous comparator is used
		Comparator<Integer> desc = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1 , Integer i2)
			{
				return -i1.compareTo(i2);
			}
		};
		
		
		//we should create the anonymous comparator and pass the object pass in the TreeSet
		TreeSet<Integer> it = new TreeSet<>(desc); // Integer class implements comparable default so ascending order
		it.add(12);
		it.add(6);
		it.add(18);
		it.add(21);
		
		System.out.println(it);
	}

}
