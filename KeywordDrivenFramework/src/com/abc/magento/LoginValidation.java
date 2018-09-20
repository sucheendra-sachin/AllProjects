package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		FileInputStream fis = new FileInputStream("D:\\ECLIPSE PROGRAMS\\MAY BATCH\\KeywordDrivenFramework\\src\\com\\abc\\utilities\\keyworddriven.properties");
		Properties p=new Properties();
		p.load(fis);

		String myAcct=p.getProperty("myAccount");
		String email=p.getProperty("email");
		String password = p.getProperty("password");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");
		
		driver.findElement(By.xpath(myAcct)).click();
		driver.findElement(By.xpath(email)).sendKeys("sucheendra.abc@gmail.com");
		driver.findElement(By.xpath(password)).sendKeys("Welcome123");
		driver.findElement(By.xpath(login)).click();
		driver.findElement(By.xpath(logout)).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
