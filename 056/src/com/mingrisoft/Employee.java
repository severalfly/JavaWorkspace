package com.mingrisoft;



public class Employee implements Cloneable{
	private String namString;
	private int age;
	private Address address;
	public Employee(String nameString, int age, Address address) {
		// TODO Auto-generated constructor stub
		this.namString = nameString;
		this.age = age;
		this.address = address;
	}
	public String getNamString() {
		return namString;
	}
	public void setNamString(String namString) {
		this.namString = namString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString(){
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("name: " + namString + ",");
		sBuilder.append("age: "+ age + "\n");
		sBuilder.append("Address: "+address );
		return sBuilder.toString();
	}
	@Override
	public Employee clone(){
		// TODO Auto-generated constructor stub
		Employee employee = null;
		try {
			employee = (Employee)super.clone();
			employee.address = address.clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return employee;
	}
}
