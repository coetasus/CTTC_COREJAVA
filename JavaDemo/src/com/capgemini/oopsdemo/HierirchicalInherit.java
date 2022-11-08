package com.capgemini.oopsdemo;
class Onee{
	void disp1() {
		System.out.println("One");
	}
}
class Twoo extends Onee{
	void disp2() {
		System.out.println("Two");
	}
}
class Three extends Onee{
	void disp3() {
		System.out.println("Three");
	}
}
class Four extends Onee{
	void disp4() {
		System.out.println("Four");
	}
}
public class HierirchicalInherit {

	public static void main(String[] args) {
		Four obj1= new Four();
		obj1.disp1();
		obj1.disp4();
		
		Three obj2 = new Three();
		obj2.disp1();
		obj2.disp3();
		
		Twoo obj3= new Twoo();
		obj3.disp1();
		obj3.disp2();
		
		

	}

}
