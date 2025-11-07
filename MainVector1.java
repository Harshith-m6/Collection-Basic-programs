package com.geeks.collection;
import java.util.*;
public class MainVector1 {
	public static void main(String[] args) {
		Vector<Double> prices = new Vector<>(4,2); //(int initalcapacity ,int incrementalcapacity)
		System.out.println("Size" + prices.size());
		System.out.println("Capacity "+prices.capacity());
		
		prices.add(20.00);
		prices.add(10.0);
		prices.add(null);
		prices.add(400.00);
		prices.add(90.00);
		
		System.out.println(prices);
		
		prices.addElement(9000.0);//vector class method
		
		System.out.println(prices.size());
		System.out.println(prices.capacity());
		
		//all the methos in the vector are synchronized
		
		System.out.println(prices.get(3)); // returns the object
		System.out.println(prices.elementAt(0));
	
		
		
	}

}
