//super keyword

package com.tns.java;
class Person{
	void message() {
		System.out.println("this is person class");
	}
}
 class Student extends Person
 {
	 void message() 
	 {
		 System.out.println("this is student class");
	 }
	 void display()
	 {
		 message();
		 super.message();
	 }
 }

public class Super {

	public static void main(String[] args) {
		Student s = new Student();
		s.display();

	}

}
