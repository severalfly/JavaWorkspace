package com.mingrisoft;

public class Employee implements Comparable<Employee>{
	private int id;
	private String nameString;
	private int age;
	public Employee(int id, String nameString, int age) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nameString = nameString;
		this.age = age;
	}
	@Override
	public int compareTo(Employee oEmployee ){
		if (id < oEmployee.id) {
			return -1;
		}else if (id > oEmployee.id) {
			
			
			return 1;
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString(){
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Number: " + id);
		sBuilder.append(", Name: "+nameString);
		sBuilder.append(", age: "+ age);
		return sBuilder.toString();
	}
}
