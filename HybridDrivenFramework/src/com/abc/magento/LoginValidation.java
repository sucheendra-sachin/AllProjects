package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		FileInputStream fis = new FileInputStream("D:\\ECLIPSE PROGRAMS\\MAY BATCH\\HybridDrivenFramework\\src\\com\\abc\\utilities\\hybdrid.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String userid = p.getProperty("userid");
		String password = p.getProperty("password");
		String myAcct=p.getProperty("myAccount");
		String email=p.getProperty("email");
		String passwordLocator = p.getProperty("passwordLocator");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");
		
		driver.get(url);
		driver.findElement(By.xpath(myAcct)).click();
		driver.findElement(By.xpath(email)).sendKeys(userid);
		driver.findElement(By.xpath(passwordLocator)).sendKeys(password);
		driver.findElement(By.xpath(login)).click();
		driver.findElement(By.xpath(logout)).click();
		
		Thread.sleep(5000);
		
		driver.quit();


	}

}
