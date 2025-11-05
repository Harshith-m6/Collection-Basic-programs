package com.geeks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainRunnerStu {
	public static void main(String[] args) {
		ArrayList<StudentComparable> stuList = new ArrayList<StudentComparable>();
		stuList.add(new StudentComparable(123, "Harshith",99.99));
		stuList.add(new StudentComparable(234 , "prajwal" , 98.00));
		stuList.add(new StudentComparable(99,"aju",1.00));
		
		System.out.println("Student details insertion order");
		Iterator<StudentComparable> itr = stuList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("student details sorted order based on percentage");
		
		Collections.sort(stuList);
		
		for(StudentComparable stu : stuList)
		{
			System.out.println(stu);
		}
	}

}
