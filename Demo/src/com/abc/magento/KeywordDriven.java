package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDriven {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		FileInputStream fis = new FileInputStream("D:\\ECLIPSE PROGRAMS\\MAY BATCH\\Demo\\src\\com\\abc\\utilities\\Keyword.properties");
		Properties p=new Properties();
		p.load(fis);

		String myAcctkey = p.getProperty("account");
		String emailKey = p.getProperty("email");
		String passKey = p.getProperty("password");
		String loginKey = p.getProperty("login");
		String logoutKey = p.getProperty("logout");
		
		driver.findElement(By.xpath(myAcctkey)).click();
		driver.findElement(By.xpath(emailKey)).sendKeys("sucheendra.abc@gmail.com");
		driver.findElement(By.xpath(passKey)).sendKeys("Welcome123");
		driver.findElement(By.xpath(loginKey)).click();
		driver.findElement(By.xpath(logoutKey)).click();
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}

}
