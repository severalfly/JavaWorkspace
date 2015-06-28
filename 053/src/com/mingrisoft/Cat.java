package com.mingrisoft;

import java.awt.Color;

public class Cat {
	private String nameString;
	private int age;
	private double weight;
	private Color color;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Cat(String nameString, int age, double weight, Color color) {
		// TODO Auto-generated constructor stub
		this.nameString = nameString;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("name: " + nameString + '\n');
		sBuilder.append("age: " + age + '\n');
		sBuilder.append("weight: " + weight + '\n');
		sBuilder.append("color: " + color + '\n');
		return sBuilder.toString();
	}
}
