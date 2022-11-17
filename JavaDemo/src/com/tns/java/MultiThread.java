package com.tns.java;
class Eclipse extends Thread{
	public void run()
	{
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
	}
	}
class Calculator extends Thread{
	public void run()
	{
		System.out.println("calculator Thread name is"+Thread.currentThread().getName());
	}
    }
class Chrome extends Thread{
	{
		System.out.println("chrome Thread name is"+Thread.currentThread().getName());
	}
}
class OneNote extends Thread{
	{
		System.out.println("onenote Thread name is"+Thread.currentThread().getName());
	}
}

public class MultiThread {

	public static void main(String[] args) {
		Eclipse e= new Eclipse();
		e.start();
		
		Calculator c= new Calculator();
		c.start();
		
		Chrome n = new Chrome();
		n.start();
		
		OneNote on = new OneNote();
		on.start();

	}

}
