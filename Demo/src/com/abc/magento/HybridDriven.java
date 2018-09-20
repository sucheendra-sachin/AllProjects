package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HybridDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FileInputStream fis = new FileInputStream("D:\\ECLIPSE PROGRAMS\\MAY BATCH\\Demo\\src\\com\\abc\\utilities\\Hybrid.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String urlKey = p.getProperty("url");
		String usernameKey = p.getProperty("username");
		String passwordKey = p.getProperty("password");
		String myAcctkey = p.getProperty("account");
		String emailKey = p.getProperty("email");
		String passKey = p.getProperty("password1");
		String loginKey = p.getProperty("login");
		String logoutKey = p.getProperty("logout");
		
		
		driver.get(urlKey);
		driver.findElement(By.xpath(myAcctkey)).click();
		driver.findElement(By.xpath(emailKey)).sendKeys(usernameKey);
		driver.findElement(By.xpath(passKey)).sendKeys(passwordKey);
		driver.findElement(By.xpath(loginKey)).click();
		driver.findElement(By.xpath(logoutKey)).click();
		Thread.sleep(4000);
		
		driver.quit();
		
		


	}

}
