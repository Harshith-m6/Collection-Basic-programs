package com.geeks.collection;
import java.util.*;
public class TreeSet7 {
	
	public static void main(String[] args) {
		

		//Comparator using lambda expression
		
		Comparator<Products> nameComp =(p1,p2) -> p1.getName().compareTo(p2.getName());
		//removes the duplicates and sorts in ascending order
		TreeSet<Products>  tp = new TreeSet<Products>((p1,p2)-> p1.getId().compareTo(p2.getId()));
		tp.add(new Products(123,"Mobile",100000.00));
		tp.add(new Products(234,"Laptop",200000.00));
		tp.add(new Products(345,"TV",300000.0));
		tp.add(new Products(123,"Iphone",100000.00));
		tp.add(new Products(234,"Macbook",200000.00));
		
		for(Products p : tp)
		{
			System.out.println(p);
		}
		
		System.out.println("---------------------------------------------------");
		//we can pass the variable of the comparator lambda function inide the TreeSet Constructor to customize the sorting
		TreeSet<Products>  t = new TreeSet<Products>(nameComp);
		t.add(new Products(123,"Fridge",100000.00));
		t.add(new Products(234,"TV",200000.00));
		t.add(new Products(345,"TV",300000.0));
		t.add(new Products(123,"Iphone",100000.00));
		t.add(new Products(234,"Iphone",200000.00));
		
		

		for(Products q : t)
		{
			System.out.println(q);
		}
		
		
	}

}
