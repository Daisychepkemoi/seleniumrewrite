package org.example.context;

import static org.example.utils.ReadProperties.getPropertiesFile;

public class Constants {
	//base url,
	// location of driver
	// etc

	public static final String BASE_URL = getPropertiesFile().getProperty("BASE_URL");
	public static final String DRIVER_LOCATION = getPropertiesFile().getProperty("DRIVER_PATH");
}
