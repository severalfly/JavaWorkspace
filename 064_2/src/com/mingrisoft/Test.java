package com.mingrisoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User chose GIF");
		ImageSaver saver = TypeChooser.getImageSaver("GIF");
		saver.save();
		
		System.out.println("User chose JPG");
		saver = TypeChooser.getImageSaver("JPG");
		saver.save();
	}

}
