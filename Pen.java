package com.geeks.collection;

public class Pen implements Comparable<Pen>{
	
	String name ;
	Double price;
	public Pen(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Pen p) {
		return this.price.compareTo(p.price);
//		return this.name.compareTo(p.name);
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
