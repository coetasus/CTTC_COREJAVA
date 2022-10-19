//21 break continue program
package com.capgemini.javademo;

public class BreakCont {
    //declared the main method
	public static void main(String[] args) {
		//for loop is initialised
        for(int i=1; i<=10; i++)
        {
       	 if(i == 1)
       	 {
       		 continue;   // break;
       	 }
       	 //printing i
       	 System.out.println(i);
        }

	}

}
