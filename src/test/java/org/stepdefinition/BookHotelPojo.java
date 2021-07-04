package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojo extends BaseClass {
	public BookHotelPojo() {
		 PageFactory.initElements(driver, this);
	}
	 @FindBy(id="first_name")
	 private WebElement firstName;
	 @FindBy(id="last_name")
	 private WebElement lastName;
	 @FindBy(id="address")
	 private WebElement adress;
	 @FindBy(id="cc_num")
	 private WebElement creditCardNumber;
	 @FindBy(id="cc_type")
	 private WebElement drdCreditCardType;
	 @FindBy(id="cc_exp_month")
	 private WebElement drdMonth;
	 @FindBy(id="cc_exp_year")
	 private WebElement drdYear;
	 @FindBy(id="cc_cvv")
	 private WebElement cvvNumber;
	 @FindBy(id="book_now")
	 private WebElement btnBooknow;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getDrdCreditCardType() {
		return drdCreditCardType;
	}
	public WebElement getDrdMonth() {
		return drdMonth;
	}
	public WebElement getDrdYear() {
		return drdYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBtnBooknow() {
		return btnBooknow;
	}
	public void bookHotel() {
		fillText(getFirstName(), "suguna");
		fillText(getLastName(), "vasudevan");
		fillText(getAdress(), "chennai");
		fillText(getCreditCardNumber(), "1234567898765432");
		selectByIndex(getDrdCreditCardType(), 2);
		selectByIndex(getDrdMonth(), 4);
		selectByVisibleText(getDrdYear(), "2022");
		fillText(getCvvNumber(), "234");
		btnClick(getBtnBooknow());
		WebElement txtOrderNo = driver.findElement(By.id("order_no"));
		String text = txtOrderNo.getAttribute("value");
		System.out.println("Order Id is: "+text);

	}
}
