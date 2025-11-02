package com.geeks.collection;

import java.util.*;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,4,5,5));
		
		//iterating using for each loop
		for(int n : ar)
		{
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		//iterating using Iterator cursor
		Iterator<Integer> it = ar.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}

}
