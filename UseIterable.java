package com.geeks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterable {
	public static void main(String[] args) {
		
		List<Integer> it = new ArrayList();
		it.add(1);
		it.add(20);
		it.add(30);
		
		//all the classes that implements iterable can iterate through their list , iterator() methods have their own implementation of the particular subclasses
		Iterator<Integer> iterator = it.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
