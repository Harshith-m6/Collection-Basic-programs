package com.geeks.collection;

import java.util.Objects;

public class Customer {
	
	private int mobNo;
	private String name;
	
	
	
	@Override
	public int hashCode() {
		return (Integer)mobNo;
	}
	@Override
	public boolean equals(Object obj) {
		Customer c = (Customer)obj;
		return this.mobNo==c.mobNo;
	}
	
	
	
	
	public Customer(int mobNo, String name) {
		super();
		this.mobNo = mobNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [mobNo=" + mobNo + ", name=" + name + "]";
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
