package com.capgemini.oopsdemo;

class One{
	void disp1()
	{
		System.out.println("one");
	}
}
class Two extends One{
	void disp2()
	{
		System.out.println("two");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Two obj = new Two();
	     obj.disp1();
		 obj.disp2();
	}

}
