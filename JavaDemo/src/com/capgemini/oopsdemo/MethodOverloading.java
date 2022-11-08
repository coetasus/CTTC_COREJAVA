package com.capgemini.oopsdemo;

public class MethodOverloading {
	void add(int x, int y) {
		System.out.println("Add is"+" " +(x+y));
	}
	void add(int x, int y, int z)
	{
		System.out.println("Add is"+" " +(x+y+z));
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(4, 7);
		obj.add(10,11,12);
	}

}
