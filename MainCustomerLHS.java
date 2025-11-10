package com.geeks.collection;
import java.util.*;
public class MainCustomerLHS {
	public static void main(String[] args) {
		
		LinkedHashSet<Customer> hs = new LinkedHashSet<>();
		hs.add(new Customer(1046,"Harshith"));
		hs.add(new Customer(9916,"Pavan"));
		hs.add(new Customer(9916,"Pavan"));
		hs.add(new Customer(7406,"Abhi"));
		hs.add(new Customer(7619,"Harshi"));
		
//		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}
