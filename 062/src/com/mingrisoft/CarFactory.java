package com.mingrisoft;

public class CarFactory {
	public static Car getCar(String nameString) {
		if (nameString.equalsIgnoreCase("BMW")) {
			return new BMW();
		}else if (nameString.equalsIgnoreCase("Benz")) {
			return new Benz();
		}else {
			return null;
		}
	}
}
