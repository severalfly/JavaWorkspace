package com.mingrisoft;

import java.sql.Date;

public class Employee {
	private String nameString;
	private double salary;
	private Date birthdayDate;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	
}
