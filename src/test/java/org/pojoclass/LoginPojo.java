package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class LoginPojo extends BaseClass {
		 public LoginPojo() {
			 PageFactory.initElements(driver, this);
		}
		 @FindBy(id="username")
		 private WebElement txtUsername;
		 @FindBy(id="password")
		 private WebElement txtPassword;
		 @FindBy(name="login")
		 private WebElement btnLogin;
		public WebElement getTxtUsername() {
			return txtUsername;
		}
		public WebElement getTxtPassword() {
			return txtPassword;
		}
		public WebElement getBtnLogin() {
			return btnLogin;
		}
		public void adactinLogin() {
			fillText(getTxtUsername(), "SugunaKartyk");
			fillText(getTxtPassword(), "suguna@123");
			btnClick(getBtnLogin());

		}
		
}
