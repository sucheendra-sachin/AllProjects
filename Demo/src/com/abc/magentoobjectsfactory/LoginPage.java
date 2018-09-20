package com.abc.magentoobjectsfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement pwd;
	@FindBy(id="send2")
	WebElement login;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void sendEmail(String em)
	{
		email.sendKeys(em);
	}
	
	public void sendPassword(String pw)
	{
		pwd.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}

}
