package com.arraylist;


public class Emp2 implements Comparable<Emp2> {
	int eid;
	String ename;
	Emp2(int eid, String ename)
	{
	this.eid=eid;
	this.ename=ename;

     }
	@Override
	public int compareTo(Emp2 e2) {
		// TODO Auto-generated method stub
		return ename.compareTo(e2.ename);
	}
	

}
