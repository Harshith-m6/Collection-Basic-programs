package com.geeks.collection;
import java.util.*;
public class Panagram1 {
	
	private static boolean isPangram(String str)
	{
		if(str.length()<26)
		{
			return false;
		}
		str = str.toLowerCase();
		for(char ch='a' ; ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.next();
		
		System.out.println(isPangram(str)?"Pangram":"Not a pangram");
	}

}
