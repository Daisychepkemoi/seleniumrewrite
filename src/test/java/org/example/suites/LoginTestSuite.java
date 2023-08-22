package org.example.suites;

import org.example.pages.BaseTestPages;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.context.Constants.BASE_URL;
import static org.example.pages.BaseTestPages.getSignInPageText;
import static org.example.pages.ClientsPages.clients_nav_link;
import static org.example.pages.ClientsPages.get_text_clients_page_span_element;
import static org.example.pages.LoginPages.*;


public class LoginTestSuite extends  BaseTestSuite{
	@Test(priority = 0)
	public static void verify_user_can_access_homepage(){

		driver.get(BASE_URL + "/cas/login");
		BaseTestPages baseTestPages = PageFactory.initElements(driver, BaseTestPages.class);


		Assert.assertEquals(getSignInPageText(),"Sign in to continue");

	}


	@Test(priority = 1)
	public static void login_successfully()  {
		sendLoginDetails();
		Assert.assertEquals( get_login_successfully_text(),"Getting Started with Tingg");
		Assert.assertEquals(get_card_Admin_Nav_name_text(),"Card Admin");

	}
}
