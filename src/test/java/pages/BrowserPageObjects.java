package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test.Test_Utilities;

public class BrowserPageObjects {

	WebDriver driver = null;
	


	// Locators
	By mainAlertsAppButton = By.xpath("//h5[contains(text(),'Frame')]");
	By browserFormButton = By.xpath("//span[contains(text(),'Browser Windows')]");
	By browserWindowsButton = By.id("item-0");
	By newTabButton = By.id("tabButton");
	By newWindowMessageButton = By.id("messageWindowButton");
	By newTabMessageText = By.id("sampleHeading");

	
	
	public BrowserPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	// Browser window page methods
	public void clickMainAlertsAppButton() {
		driver.findElement(mainAlertsAppButton).click();
	}

	public void clickBrowserFormButton() {
		driver.findElement(browserFormButton).click();
	}

	public void clickNewTabButton() {
		driver.findElement(newTabButton).click();
		
	}

	public String getNewTabMessageText() {
		return driver.findElement(newTabMessageText).getText();
	}

	public void clickNewWindowMessageButton() {
		driver.findElement(newWindowMessageButton);
	}

}
