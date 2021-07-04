package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends BaseClass {
	public SearchHotelPojo() {
		 PageFactory.initElements(driver, this);
	}
	 @FindBy(id="location")
	 private WebElement drdLocation;
	 @FindBy(id="hotels")
	 private WebElement drdHotels;
	 @FindBy(id="room_type")
	 private WebElement drdRoom;
	 @FindBy(id="room_nos")
	 private WebElement drdRoomNo;
	 @FindBy(id="datepick_in")
	 private WebElement Indate;
	 @FindBy(id="datepick_out")
	 private WebElement outDate;
	 @FindBy(id="adult_room")
	 private WebElement drdAdult;
	 @FindBy(id="child_room")
	 private WebElement drdChild;
	 @FindBy(id="Submit")
	 private WebElement btnSearch;
	public WebElement getDrdLocation() {
		return drdLocation;
	}
	public WebElement getDrdHotels() {
		return drdHotels;
	}
	public WebElement getDrdRoom() {
		return drdRoom;
	}
	public WebElement getDrdRoomNo() {
		return drdRoomNo;
	}
	public WebElement getIndate() {
		return Indate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getDrdAdult() {
		return drdAdult;
	}
	public WebElement getDrdChild() {
		return drdChild;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void searchPage() {
		selectByIndex(getDrdLocation(), 2);
		selectByVisibleText(getDrdHotels(), "Hotel Sunshine");
		selectByVisibleText(getDrdRoom(), "Super Deluxe");
		selectByIndex(getDrdRoomNo(), 1);
		fillText(getIndate(), "03/07/2021");
		fillText(getOutDate(), "04/07/2021");
		selectByIndex(getDrdAdult(), 2);
		selectByIndex(getDrdChild(), 1);
		btnClick(getBtnSearch());

	}
}
