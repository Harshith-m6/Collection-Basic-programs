package com.geeks.collection;

import java.util.Objects;

public class StudentHashSet {
	
	private int id ;
	private String name;
	private double per;
	
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id,name.toLowerCase(),per);
	}
	
	@Override
	public boolean equals(Object ob)
	{
		StudentHashSet std = (StudentHashSet)ob;
		return this.id==std.id || this.name.equalsIgnoreCase(std.name) || ((Double)per).equals(std.per);
		
	}
	
	public StudentHashSet(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "StudentHashSet [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	

}
