package com.mingrisoft;

public class Car {
	private String nameString;
	private double speed;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
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
		sBuilder.append("name: " + nameString + ",");
		sBuilder.append("speed: " + speed + "Km/h");
		return sBuilder.toString();
	}
}
