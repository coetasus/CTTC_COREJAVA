package com.tns.java;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj = new HashSet<>();
		obj.add("Lily");
		obj.add("Daisy");
		obj.add("Tulip");
		obj.add("Rose");
		obj.add(null);
		
		Set<String> obj1=new HashSet<>();
		obj1.add("Lily");
		obj1.add("Daisy");
		obj.add("Rose");
		
		System.out.println(obj);
		System.out.println(obj.isEmpty());

		System.out.println(obj1.size());
		System.out.println(obj.size());

	}

}
