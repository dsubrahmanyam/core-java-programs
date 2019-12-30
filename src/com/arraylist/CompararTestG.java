package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CompararTestG {
	public static void main(String[] args) {
		ArrayList<Emp2> al = new ArrayList<Emp2>();
		al.add(new Emp2(333,"ratan"));
		al.add(new Emp2(222,"anu"));
		al.add(new Emp2(111,"Sravya"));
		Collections.sort(al);
		for(Emp2 e2:al)
		{
			System.out.println(e2.eid+" "+e2.ename);
		}
		
		}
		}
		

