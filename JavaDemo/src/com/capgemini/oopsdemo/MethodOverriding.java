//method overriding using inheritance

package com.capgemini.oopsdemo;
class Super
{
	void disp()
	{
		System.out.println("Super Class");
	}
}
class SubClass extends Super{
	void disp() {
		super.disp();
		System.out.println("only sub class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.disp();

	}

}
