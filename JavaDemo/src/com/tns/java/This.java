package com.tns.java;

public class This 
	{
		int num;
		public void setNum(int num)
		{
			this.num = num;
		}
	

	public static void main(String[] args) {
	 This obj = new This();
	 obj.setNum(10);
	 System.out.println("Number value :"+obj.num);

	}

}
