package com.emp.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(111,"ram"));
		al.add(new Emp(666,"jam"));
		al.add(new Emp(222,"pam"));
		Collections.sort(al,new EnameComp());
		for(Emp e:al)
		{
			System.out.println(e.eid+" "+e.ename);
		}

	}

}
