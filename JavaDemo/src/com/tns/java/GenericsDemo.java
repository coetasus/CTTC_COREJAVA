package com.tns.java;

class demo<k,v>
{
	private k key;
	private v value;
	
	public demo(k key, v value) {
		this.key=key;
		this.value = value;
		}
	public k getkey() {
		return key;
	}
	public v getvalue() {
		return value;
	}
	public String tostring() {
		return "demo [key=" + key+",value="+value+"]";
	}
	public<e,n>void print(e element,n number)
	{
		System.out.println("elements"+element +"number."+number);
	}
	
}
public class GenericsDemo {

	public static void main(String[] args) {
		demo<Integer,String> d=new demo<Integer,String>(1,"Radhika");
		System.out.println("key:"+d.getvalue());
		d.print(123f, "Rani");
		
		
	}

}
