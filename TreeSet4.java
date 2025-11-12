package com.geeks.collection;
import java.util.*;
public class TreeSet4 {

	public static void main(String[] args) {
		final TreeSet <Pen> p= new TreeSet();
		p.add(new Pen("Black", 4.00));
		p.add(new Pen("Blue", 5.00));
		p.add(new Pen("Red" , 5.00));
		p.add(new Pen("Green", 100.0));
		p.add(new Pen("Green", 1000.0));

		for(Pen pen : p)
		{
			System.out.println(pen);
		}
		

		
		
	}
}
