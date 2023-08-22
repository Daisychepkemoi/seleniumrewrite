package org.example.pages;

import com.github.javafaker.Faker;
import org.example.context.WebDriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.context.WebDriverContext.explicitWait;

public class ClientsPages {

	static Faker faker = new Faker();
	public static WebElement clients_nav_link() {
		return explicitWait(By.cssSelector("a[fragment='Clients']"));
	}


	 public static WebElement clients_page_span_element(){
		return WebDriverContext.explicitWait(By.xpath("//span[contains(text(),'Clients')]"));
	}

	static WebElement add_client_button(){
		return explicitWait(By.className("btn-create"));
	}


	static WebElement add_client_pop_up_box(){
		return explicitWait(By.className("modal-title"));
	}
	static WebElement add_client_input_box(){
		return explicitWait(By.id("clientName"));
	}

	public static WebElement save_client_button(){
		return explicitWait(By.xpath("//button[contains(text(),'Save')]"));
	}

	static WebElement add_client_warning_message(){
		return explicitWait(By.xpath("//div[contains(text(),'Client Name is mandatory.')]"));
	}
	static WebElement add_client_success_message(){
		return explicitWait(By.xpath("//*[contains(text(),'Record created successfully')]"));
	}
	public static String get_text_clients_page_span_element(){
		return clients_page_span_element().getText();
	}



	public static void click_add_client_button(){
		add_client_button().click();
	}
	public static String get_text_add_client_pop_up_box(){
		return add_client_pop_up_box().getText();
	}

	public static void send_client_name(){
		add_client_input_box().clear();
		add_client_input_box().sendKeys(faker.name().firstName() + faker.name().lastName());
	}

	public static void click_save_button(){
		save_client_button().click();
	}

	public static String getText_add_client_warning_message(){
		return add_client_warning_message().getText();
	}

	public static String get_text_add_client_success_message(){
		return add_client_success_message().getText();
	}

}
