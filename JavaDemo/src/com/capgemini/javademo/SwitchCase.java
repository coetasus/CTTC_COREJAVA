//15 Switch case program
package com.capgemini.javademo;

public class SwitchCase {
     //main method declared
	public static void main(String[] args) {
		char x = 'F';
		switch (x) 
		//switch cases started
		{
		//if case a is true then it will executed
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
			
		//if case b is true then it will execute	
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		//if case c is true then it will execute
		case 'c':
			
			
	    case 'C' :	
			System.out.println("The value of x is c");
			break;
		
	    //if condition is not satisfied then default case will execute
	    default:
			
	System.out.println("The value of x is other than a,b,c");
			break;

	}

	}}
