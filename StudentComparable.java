package com.geeks.collection;

public class StudentComparable implements Comparable<StudentComparable>{
	
	private Integer id;
	private String name ;
	private Double per;
	
	public StudentComparable(Integer id , String name , Double per)
	{
		super();
		this.id = id;
		this.name = name ;
		this.per = per;
	}
	public int compareTo(StudentComparable std)
	{
		return per.compareTo(std.per);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPer() {
		return per;
	}
	public void setPer(Double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "StudentComparable [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	

}
