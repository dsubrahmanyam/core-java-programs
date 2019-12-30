package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) 
{

	List<Integer> s=new ArrayList<Integer>();
	s.add(10);
	s.add(9);
	s.add(16);
	s.add(19);
	s.add(18);
	s.add(13);
	s.add(11);
	
System.out.println(s);
Collections.swap(s,1,3);
System.out.println(s);
System.out.println(s.subList(3, 6));
System.out.println("hi="+Collections.max(s));
System.out.println("hi="+Collections.min(s));
Collections.sort(s,Collections.reverseOrder());//decending order
System.out.println(s);
s.remove(1);
System.out.println(s);
Collections.sort(s);
System.out.println(s);
boolean ss=s.contains(97);
System.out.println(ss);

	
}
}
