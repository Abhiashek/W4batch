package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlipkart {

	 WebDriver driver;
	public LoginFlipkart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
	}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement username;
	public void sendusername()
	{
		username.sendKeys("8412965949");
	}
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	public void sendpassword()
	{
		password.sendKeys("a04y84");
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement login;
	public void clicklogin()
	{
	 login.click();
	}
}
