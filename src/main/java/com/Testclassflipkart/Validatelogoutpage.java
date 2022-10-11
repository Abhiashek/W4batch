package com.Testclassflipkart;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bseclassf.Loginbaseclass;
import com.flipkart.pom.HomeFlipkart;


import com.screenshot.Screenshot;


public class Validatelogoutpage extends Loginbaseclass
{
	
	
	@Test
	public void validatelogout() throws InterruptedException, IOException
	{
    HomeFlipkart x = new HomeFlipkart(driver);
     x.clickmyaccount();
     x.logoutaccount();
     Screenshot.TakeScreenshot(driver, "Logout");
     String actualtitle=driver.getTitle();
 	System.out.println(actualtitle);
 	String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
 	Assert.assertEquals(actualtitle, expectedtitle);
	}

}
