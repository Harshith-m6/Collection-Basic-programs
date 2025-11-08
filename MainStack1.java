package com.geeks.collection;

import java.util.Stack;

public class MainStack1 {
	public static void main(String[] args) {
		//LIFO
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(1);
		stk.push(2);
		stk.push(4);
		stk.push(6);
		System.out.println(stk);
		
		Integer i1 = stk.pop();
		System.out.println(i1);
		System.out.println(stk.peek());
		System.out.println(stk.peek()); // just returns the last element that is currently present in stack
		
		System.out.println(stk.search(2));
		System.out.println(stk.search(1)); //returns the position of the given element from the top
		
		System.out.println(stk.indexOf(4)); // returns the element that is present in the given position / index where the index starts from zero
		
		
	}

}
