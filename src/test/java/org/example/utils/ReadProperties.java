package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.example.context.Constants.DRIVER_LOCATION;

public class ReadProperties {
	public static Properties getPropertiesFile() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/test/resources/testng-selenium.properties"));

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return properties;
	}

}
