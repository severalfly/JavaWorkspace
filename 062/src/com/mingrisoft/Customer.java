package com.mingrisoft;

public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Customer want BMW:");
		Car bmwCar = CarFactory.getCar("BMW");
		System.out.println("Get: " + bmwCar.getInfo());
		
		System.out.println("Customer want Benz:");
		Car benzCar = CarFactory.getCar("Benz");
		System.out.println("Get: " + benzCar.getInfo());
	}

}
