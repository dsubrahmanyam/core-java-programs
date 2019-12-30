package com.strings;

import java.util.StringTokenizer;

public class StringTockenizer {
public static void main(String[] args) {
	
	 String str="subbu java developer";
	StringTokenizer st = new StringTokenizer(str);// default splitting character (space symbol)
	while (st.hasMoreElements())
	{ System.out.println(st.nextElement());
	}
	//
}
}
