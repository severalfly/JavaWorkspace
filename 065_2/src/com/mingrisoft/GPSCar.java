package com.mingrisoft;

import java.awt.Point;

public class GPSCar extends Car implements GPS {

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setLocation(super.getSpeed(), super.getSpeed());
		return point;
	}
	
	@Override
	public String toString(){
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(super.toString());
		sBuilder.append("GPS Location: " + getLocation().x + "," + getLocation().y + ".");
		return sBuilder.toString();
	}

}
