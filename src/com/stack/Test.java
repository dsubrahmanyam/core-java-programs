package com.stack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Stack<String> s = new Stack<String>();
		s.push("ratan"); //insert the data top of the stack
		s.push("anu"); //insert the data top of the stack
		s.push("durga");
		System.out.println(s);
		System.out.println(s.search("durga")); //1 last added object will become first
		System.out.println(s.size());
		System.out.println(s.peek()); //to return last element of the Stack
		s.pop(); //remove the data top of the stack
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.clear();
		System.out.println(s.isEmpty());
		}
		}

	}

