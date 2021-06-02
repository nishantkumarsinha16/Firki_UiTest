package com.Loactors;

import java.io.File;

public interface iFilePath {

	public static final File file = new File(System.getProperty("user.dir") + "/data/config.properties");
	public static final File json = new File(System.getProperty("user.dir") + "/data/userdetail.json");
	public static final String imagePath = System.getProperty("user.dir") + "/datastorage/firki.jpg";

}
