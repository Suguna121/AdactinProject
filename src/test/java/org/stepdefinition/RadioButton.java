package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton extends BaseClass {
	public RadioButton() {
		 PageFactory.initElements(driver, this);
	}
	 @FindBy(id="radiobutton_0")
	 private WebElement btnRadio;
	 @FindBy(id="continue")
	 private WebElement btnContinue;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void radioButtons() {
		btnClick(getBtnRadio());
		btnClick(getBtnContinue());
	}
}
