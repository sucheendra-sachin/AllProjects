package com.abc.magentotests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import com.abc.magentoobjects.HomePage;
import com.abc.magentoobjects.LoginPage;
import com.abc.magentoobjects.MainPage;

public class MagentoTest {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		HomePage h = new HomePage(driver);
		h.clickOnMyAcct();
		
		LoginPage l = new LoginPage(driver);
		l.sendEmail("sucheendra.abc@gmail.com");
		l.sendPassword("Welcome123");
		l.clickOnLogin();
		
		MainPage m = new MainPage(driver);
		m.clickOnLogout();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
