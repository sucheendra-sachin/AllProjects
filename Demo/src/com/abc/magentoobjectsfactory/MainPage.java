package com.abc.magentoobjectsfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;
	
	@FindBy(linkText="Log Out")
	WebElement logout;
	public MainPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void clickOnLogout()
	{
		logout.click();
	}
}
