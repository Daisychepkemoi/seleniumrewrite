package org.example.suites;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.context.Constants.BASE_URL;
import static org.example.pages.ClientsPages.*;
import static org.example.pages.LoginPages.*;

public class ClientsSuite extends BaseTestSuite{


	@Test( priority = 0)
	public static void verify_user_can_load_clients_page_successfully()   {
		driver.get(BASE_URL + "/onboarding/dashboard");
		Assert.assertEquals(get_card_Admin_Nav_name_text(),"Card Admin");
		card_Admin_Nav_name().click();
		Assert.assertEquals(clients_nav_link().getText(),"Clients");
		clients_nav_link().click();
		Assert.assertEquals(get_text_clients_page_span_element(),"Clients");
		card_Admin_Nav_name().click();

	}

	@Test(priority = 1)
	public static void verify_user_gets_valid_error_when_empty_client_name_is_sent(){
		click_add_client_button();
		Assert.assertEquals(get_text_add_client_pop_up_box(),"Add New Client");
		click_save_button();
		Assert.assertEquals(getText_add_client_warning_message(),"Client Name is mandatory.");

	}

	@Test(priority = 2)
	public static void verify_user_gets_valid_success_message_when_client_name_is_sent(){


		send_client_name();

		click_save_button();

		Assert.assertEquals(get_text_add_client_success_message(),"Record created successfully");

	}
}
