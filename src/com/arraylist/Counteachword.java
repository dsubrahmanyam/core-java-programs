package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Counteachword {
public static void main(String[] args) {
	
    ArrayList<String> list = new ArrayList<String>();	
                      list.add("aaa");
                      list.add("bbb");
                      list.add("aaa");

         HashSet<String> h = new HashSet<String>(list);
          for (String s : h) 
          {
          System.out.println(s + " = " + Collections.frequency(list, s));
}
}
}