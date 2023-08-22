package org.example.pages;

import org.example.context.WebDriverContext;
import org.example.suites.BaseTestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

//import static org.example.suites.BaseTestSuite.driver;

public class BaseTestPages extends BaseTestSuite {
	//
//	@FindBy(xpath = "//div[contains(text(),'Sign in to continue')]")
//	static WebElement signInpageText ;

	public static String getSignInPageText(){
		WebElement signInpageText = WebDriverContext.explicitWait(By.className("sub-title"));
		return signInpageText.getText();
	}

}
