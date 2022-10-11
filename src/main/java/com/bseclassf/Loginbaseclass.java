package com.bseclassf;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.flipkart.pom.LoginFlipkart;
import com.screenshot.Screenshot;

   
public class Loginbaseclass {
	public WebDriver driver;
	 public  Logger log= Logger.getLogger("Flipkartid1");
		

	@Parameters("browserName")
	@BeforeMethod
	
		
		public void  setUp(String browserName) throws InterruptedException, IOException
		{
			if(browserName.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver", 
					"./DriverFiles\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else
			{
				System.setProperty("webdriver.gecko.driver", 
						"./DriverFiles\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		LoginFlipkart x = new LoginFlipkart(driver);
		x.sendusername();
		x.sendpassword();
		x.clicklogin();
		Thread.sleep(3000);
		Screenshot.TakeScreenshot(driver, "Loginpage");
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			
		}
	

}
