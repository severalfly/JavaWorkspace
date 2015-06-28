package com.mingrisoft;

public class TypeChooser {
	public static ImageSaver getImageSaver(String type) {
		if (type.equalsIgnoreCase("GIF")) {
			return new GIFSaver();
		}else if (type.equalsIgnoreCase("JPG")) {
			return new JPGSaver();
		}else {
			return null;
		}
	}
}
