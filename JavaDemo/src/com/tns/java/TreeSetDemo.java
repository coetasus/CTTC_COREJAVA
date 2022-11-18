package com.tns.java;

import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> num = new TreeSet<>();
		for(int i=10;i>0;i--) {
			num.add("A"+i);
		}
		for(String i:num)
		{
			System.out.println(i);
		}
	}

}
