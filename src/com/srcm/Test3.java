package com.srcm;

public class Test3 {
	
	    // Since return type of RR method is 
	    // void so this method should not return any value 
	     void RR(int a)
	    { 
	       	  
	            // return statement below(only using  
	            // return statement and not returning  
	            // anything): 
	            // control exits the method if this  
	            // condition(i.e, j<9) is true. 
	         return ; 
	        //++j; 
	    } 
	    public static void main(String[] args) 
	    { 
	        new Test3().RR(5); 
	        System.out.println("In main"); 
	    } 
	}

