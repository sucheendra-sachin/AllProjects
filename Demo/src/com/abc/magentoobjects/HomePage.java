package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	By myAcct=By.linkText("My Account");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAcct()
	{
		driver.findElement(myAcct).click();
	}
}

