package org.stepdefinition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojoclass.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps extends BaseClass {
	public WebDriver driver;
	
	@Given("User is in adactin login page")
	public void user_is_in_adactin_login_page() {
	  
		launchUrl("https://adactinhotelapp.com/");
	}
	@When("User enter valid username and password and click login button")
	public void userEnterValidUsernameAndPasswordAndClickLoginButton() {
	    LoginPojo l=new LoginPojo();
	    l.adactinLogin();
	}

	@When("User select location, hotels, room type, number of rooms, Indate, Outdate, adult room, child room and click search button")
	public void userSelectLocationHotelsRoomTypeNumberOfRoomsIndateOutdateAdultRoomChildRoomAndClickSearchButton() {
		SearchHotelPojo s=new SearchHotelPojo();
		s.searchPage();
	}

	@When("User select radio button and click continue button")
	public void userSelectRadioButtonAndClickContinueButton() {
		RadioButton r=new RadioButton();
		r.radioButtons();

	}

	@When("User enter first name, last name, address, creditcard number, creditcard type, month, year, cvv number and click booknow button")
	public void userEnterFirstNameLastNameAddressCreditcardNumberCreditcardTypeMonthYearCvvNumberAndClickBooknowButton() throws InterruptedException {
		BookHotelPojo b=new BookHotelPojo();
		b.bookHotel();
		Thread.sleep(3000);

	}

	@Then("User must get the order id")
	public void userMustGetTheOrderId() {
	System.out.println("User must get the order id");
	}


}
