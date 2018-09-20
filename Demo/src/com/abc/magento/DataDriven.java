package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\com\\abc\\utilities\\DataDriven.properties");
	
		Properties p = new Properties();
		p.load(fis);
		String urlValue = p.getProperty("url");
		String emailValue = p.getProperty("email");
		String pwdValue = p.getProperty("password");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(urlValue);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("sucheendra.abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		
		Thread.sleep(5000);
		
	}

}
