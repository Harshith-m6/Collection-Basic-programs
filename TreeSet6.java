package com.geeks.collection;
import java.util.*;
public class TreeSet6 {

	public static void main(String[] args) {
		
		//if compare method gives 0 then it means duplicate we should not add into TreeSet
		//to allow duplicates we have to customize 
		Comparator<Products> duplicates = new Comparator<Products>()
				{
			@Override
			public int compare(Products p1 , Products p2)
			{
				return p1.getId().compareTo(p2.getId())>=0?1:-1;
			}
				};
		
		TreeSet<Products> tp =  new TreeSet<>(duplicates);
		
		tp.add(new Products(123,"Mobile",100000.00));
		tp.add(new Products(234,"Laptop",200000.00));
		tp.add(new Products(345,"TV",300000.0));
		tp.add(new Products(123,"Iphone",100000.00));
		tp.add(new Products(234,"Macbook",200000.00));
		
		for(Products p : tp)
		{
			System.out.println(p);
		}
		
		
		
	}
}
