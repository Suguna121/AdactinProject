package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void applyWaitToAllLocators() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void fillText(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void urlAssertForInvalidLogin() {
		String url = driver.getCurrentUrl();
		 Assert.assertTrue("check the url", url.contains("privacy_mutation_token") );    
	}
	public static void assertionForValidLogin(WebElement element) {
		Assert.assertTrue("check the data", element.isDisplayed());
	}
	public static void takeSnap(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\muthu-temp\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\Reports\\Screenshots\\" + filename + ".png");
		FileUtils.copyFile(src, des);
	}
	public static void selectByVisibleText(WebElement e, String text) {
		Select s=new Select(e);
		s.selectByVisibleText(text);

	}
	public static void selectByIndex(WebElement e, int no) {
		Select s=new Select(e);
		s.selectByIndex(no);

	}
}
