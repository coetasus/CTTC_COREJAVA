//15 switch case string
package com.capgemini.javademo;

public class SwitchString {

	//main method declared
	public static void main(String[] args) {
		//string name te is declared
		String name = "author";

		//switch case started
		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
	}

}}
