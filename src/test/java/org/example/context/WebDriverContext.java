package org.example.context;

import org.example.suites.BaseTestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebDriverContext extends BaseTestSuite {
	// has wait / driver /etc

	public static WebElement explicitWait(By findElementBy){
		WebElement webElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(findElementBy));

		return webElement;
	}
}
