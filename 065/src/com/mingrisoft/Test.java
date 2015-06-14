package com.mingrisoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Genery Car: ");
		Car car = new Car();
		car.setName("Adui");
		car.setSpeed(60);
		System.out.println(car);
		
		System.out.println("GPS Car: ");
		GPSCar gpsCar = new GPSCar();
		gpsCar.setName("Adui");
		gpsCar.setSpeed(60);
		System.out.println(gpsCar);
	}

}
