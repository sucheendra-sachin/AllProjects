package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;
	
	By logout=By.linkText("Log Out");
	public MainPage(WebDriver driver) 
	{
		
		this.driver=driver;
	}

	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
}
