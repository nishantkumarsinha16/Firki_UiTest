package com.Loactors;

import java.io.File;

public interface iFilePath {
	
	public static final File file = new File(System.getProperty("user.dir") + "/data/config.properties");

}
