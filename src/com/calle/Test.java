package com.calle;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("subbu");
		al.add("ratan");
		al.add(70);
		System.out.println("Arralist Data is:"+al);//Arralist Data is:[10, subbu, ratan, 70]
		System.out.println("Arralist Data is:"+al.size());//Arralist Data is:4
		al.add(1,"Durga");
		System.out.println("Arralist Data is:"+al);//Arralist Data is:[10, Durga, subbu, ratan, 70]
		al.remove("subbu");
		System.out.println("Arralist Data is:"+al);//Arralist Data is:[10, Durga, ratan, 70]
		al.set(0, "brahmi");
		System.out.println("Arralist Data is:"+al);//Arralist Data is:[brahmi, Durga, ratan, 70]
		System.out.println("Arralist Data is:"+al.isEmpty());//Arralist Data is:false
		//al.get(3);
		System.out.println("Arralist Data is:"+al.get(3));
		al.clear();
		System.out.println("Arralist Data is:"+al.isEmpty());
		
	

	}

}
