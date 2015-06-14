package com.mingrisoft;

public class Car {
	private String name;
	private double speed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString(){
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Name: " + name);
		sBuilder.append(", Speed: " + speed + "Km/h");
		return sBuilder.toString(); 
	}
}