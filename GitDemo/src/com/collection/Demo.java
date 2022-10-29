package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

	ArrayList<String>al=new ArrayList<String>();	
	al.add("suraj");
	al.add("ram");
	al.add("raj");
	al.add("shree");
	
	Iterator<String> itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
		
	}

}
