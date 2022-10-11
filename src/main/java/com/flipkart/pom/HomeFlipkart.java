package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFlipkart {
	
WebDriver driver;
Actions act ;
public HomeFlipkart(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//div[text()='My Account']")
WebElement myaccountclick;
public void clickmyaccount() throws InterruptedException
{
	act= new Actions(driver);
     act.moveToElement(myaccountclick).perform();
     Thread.sleep(1000);
}
@FindBy(xpath="(//a[@class='_2kxeIr'])[9]")
WebElement logout;
public void logoutaccount() throws InterruptedException
{
	logout.click();
	Thread.sleep(3000);
}
}
