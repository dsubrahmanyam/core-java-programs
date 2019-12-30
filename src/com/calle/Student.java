package com.calle;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp s1=new Emp(111,"subbu");
		Emp s2=new Emp(222,"raja");
		Emp s3=new Emp(999,"jhony");
		Emp s4=new Emp(888,"bullet");

ArrayList<Emp> al=new ArrayList<Emp>();
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
System.out.println(al);
Iterator itr=al.iterator();
while(itr.hasNext()) {
	Emp e=(Emp)itr.next();
System.out.println(e.eid+" "+e.ename);

	}

}}
