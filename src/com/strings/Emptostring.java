package com.strings;

public class Emptostring {
	String ename;
	int eid;
	Emptostring(String ename,int eid)
	{
		this.ename=ename;
		this.eid=eid;
	}
	public String toString()
	{
	return "Emp id="+eid+" Emp ename="+ename;
	}
	public static void main(String[] args) {
		Emptostring e=new Emptostring("raj",777);
		System.out.println(e);
		//System.out.println(e.toString());
	}
	}

