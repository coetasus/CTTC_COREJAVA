package com.capgemini.oopsdemo;
class Eleven{
	void disp1()
	{
		System.out.println("one");
	}
}
class Twelve extends Eleven{
	void disp2() {
		System.out.println("Two");
	}
	
}
class Thirteen extends Twelve{
	void disp3() {
	System.out.println("Three");
	}
}
class Fourteen extends Thirteen{
	void disp4()
	{
		System.out.println("Four");
	}
}
public class MultilevelInherit {

	public static void main(String[] args) {
		Fourteen obj1 = new Fourteen();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
		
		
		

	}

}
