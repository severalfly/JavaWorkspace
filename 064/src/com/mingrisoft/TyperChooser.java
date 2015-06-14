package com.mingrisoft;

public class TyperChooser {
	public static ImageSaver getSaver(String type) {
		if (type.equalsIgnoreCase("GIF")) {
			return new GIFSaver();
		}else if (type.equalsIgnoreCase("JPG")) {
			return new JPGSaver();
		}else if (type.equalsIgnoreCase("PNG")) {
			return new PNGSaver();
		}else {
			return null;
		}
	}
}
