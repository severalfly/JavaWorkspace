package com.mingsoft;

public class Ex054Employee {
	private String nameString;
	private int ageInt;
	
	@Override
	public String toString(){
		return "姓名: " + nameString + ", 年龄" + ageInt;
	}
	public void setName(String nameString) {
		this.nameString = nameString;
	}
	public void setAge(int ageInt) {
		this.ageInt = ageInt;
	}
	public String getNameString() {
		return this.nameString;
	}
	public int getAgeInt() {
		return this.ageInt;
	}
}
