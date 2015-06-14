package com.mingrisoft;

public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User choosed GIF:");
		ImageSaver saver = TyperChooser.getSaver("GIF");
		saver.save();
		
		System.out.println("User choosed JPG:");
		saver = TyperChooser.getSaver("JPG");
		saver.save();
		
		System.out.println("User choosed PNG:");
		saver = TyperChooser.getSaver("PNG");
		saver.save();
	}

}
