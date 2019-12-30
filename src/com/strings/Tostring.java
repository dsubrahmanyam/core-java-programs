package com.strings;

public class Tostring {
	int sid;
	String sname;
	Tostring(int sid,String sname)
	{
		
		this.sid=sid;
		this.sname=sname;
	}
public  String toString()
{
	return "Tostring id="+sid+" Tostring name="+sname;
}
	public static void main(String[] args) {
		Tostring t=new Tostring(111,"subbu");
		System.out.println(t.toString());
		// TODO Auto-generated method stub

	}

}
