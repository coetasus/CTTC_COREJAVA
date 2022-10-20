package com.capgemini.javademo;

public class Heello {
	public static void main(String[]args) {
		Bus Bus= new Bus();
		Bus.setDoors("close");
		Bus.setSpeed(10);
		System.out.println(Bus.run());
	}
}


 class Bus{
	private String doors;
	private int speed;
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run() {
		if(doors.equals("closed") && speed > 0)
		{
			return "running";
		}
		else
		{
			return "not running";
		}
	}
}