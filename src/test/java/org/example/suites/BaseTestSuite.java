package org.example.suites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static org.example.context.Constants.DRIVER_LOCATION;

public class BaseTestSuite {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeSuite(alwaysRun = true)
	public static WebDriver setUp(){
		System.setProperty("webdriver.chrome.driver", DRIVER_LOCATION);
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 60);
		return driver;
	}

	@AfterSuite
	public static void close(){
		driver.close();
		driver.quit();
	}

}
