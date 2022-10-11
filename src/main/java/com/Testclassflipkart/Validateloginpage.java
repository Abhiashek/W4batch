package com.Testclassflipkart;



import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bseclassf.Loginbaseclass;

public class Validateloginpage extends Loginbaseclass
{
    @Test

public void validatelogin()
{
	String actualtitle=driver.getTitle();
//	System.out.println(actualtitle);
	log.info(actualtitle);
	String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	Assert.assertEquals(actualtitle, expectedtitle);
}
}
