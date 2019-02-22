package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import Classes.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MobilePhonesDefinition {
	protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

	@Given("^Mobile Phones section is selected$")
	public void mobile_phones_sect_is_selected() {
		app.init();
	}

	@When("^user enters producer and price$")
	public void user_enters_producer_and_price() {		
		app.priceHelper.setPrice("20000");
		app.getManufNames().get_manufacturer("Apple", "Samsung");
	}

	/*@Then("^user goes to the Mobile Phones section$")
	public void user_goes_to_the_Mobile_Phones_section() {

	}

	@Then("^user selects the manufacturer and enters the price&")
	public void user_selects_the_manuf_and_enters_the_price() {

	}

	@Then("^user sees 68 products&")
	public void user_sees_68_products() {
		// driver.findElement(By.xpath(""));
		app.stop();

		// Assert.assertEquals("����������� � ������ �� ������.�������", title);
	}*/

}
