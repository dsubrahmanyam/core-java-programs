package com.arraylist;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="i am java developer jan";  
		String[] str=sen.split("");
		//System.out.println(str);
		int count=1;
				for(int i=0;i<str.length;i++) 
				{
				       for(int j=i+1;j<str.length;j++)
						 {
					       if(str[i].equals(str[j]))
					           {
						         count++;
						         str[j]="0";
					                            //	System.out.println(count);
					            }
						  }
					                            /*System.out.println(str[count]);*/

				         if(str[i]!="0")
						    System.out.println(str[i]+"---.>"+count);

				              count=1;
				} 
					

	}

}
