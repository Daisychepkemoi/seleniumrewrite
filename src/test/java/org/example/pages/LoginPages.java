package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.context.WebDriverContext.explicitWait;

public class LoginPages {
	public static WebElement login_username_input(){
		return explicitWait(By.id("email"));
	}
	public static WebElement login_password_input(){
		return explicitWait(By.id("password"));
	}
	public static WebElement login_button(){
		return explicitWait(By.className("btn-submit"));
	}

	public static WebElement login_successfully_text(){
		return explicitWait(By.xpath("//strong[contains(text(),'Getting Started with Tingg')]"));
	}
	public static WebElement card_Admin_Nav_name(){
		return explicitWait(By.xpath("//span[contains(text(),'Card Admin')]"));
	}
	public static void sendLoginDetails(){
		login_username_input().clear();
		login_username_input().sendKeys("dchepkemoi@dispostable.com");
		login_password_input().clear();
		login_password_input().sendKeys("QADchepkemoi@321");
		login_button().click();
	}
	public static String get_login_successfully_text(){
		return login_successfully_text().getText();
	}

	public static String get_card_Admin_Nav_name_text(){
		return card_Admin_Nav_name().getText();
	}

}
