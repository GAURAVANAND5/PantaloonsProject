package com.pantalooons.LoginPage;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericLibaray.BaseAnnotationClass;
import com.POMreporistory.Login_Reg;

public class loginTest  extends BaseAnnotationClass{
	
	@Test
	public void Createpage() throws IOException, InterruptedException
	{
		Login_Reg lp = new Login_Reg(driver);
		lp.myAccount();
	    lp.getMyaccount().click();
		
		
		String actualurl="https://www.pantaloons.com/";
		String expectedurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl,expectedurl);
	     wLib.wait(50000);		
		String actualmsg1="Enter Mobile Number*";
		String actualmsg2="Or login with";
		wLib.waitUntilPageLoad(driver);
		String expectedmsg1 = lp.getReglogin().getText();
		wLib.waitUntilPageLoad(driver);
		String expectedmsg2 = lp.getGooglelogin().getText();
		
		Assert.assertEquals(actualmsg1, expectedmsg1);
		Assert.assertEquals(actualmsg2, expectedmsg2);
		
		Reporter.log("Both options dispalying",true);
	  

		String actualmob="Please enter your phone number";
		String Mob1 = fLib.getFileProperty("mob");
		lp.Mob(Mob1);
		wLib.waitUntilPageLoad(driver);
		String expectedmob=lp.getBtn_mob().getText();
		if(actualmob.equals(expectedmob))
		{
			lp.getBtn_mob().click();
		}
		else
		{
			System.out.println("Enter the mobile number");
		}
		
		
		
		
	}
	@Test
	public void VerifyGoogle() throws IOException, InterruptedException
	{
	
		Login_Reg lp = new Login_Reg(driver);
		lp.myAccount();
	    lp.getMyaccount().click();
		lp.login();
//		// String expectedtitle=driver.getTitle();
//		//wLib.switchToWindow(driver, expectedtitle);
//		Set<String> wh = driver.getWindowHandles();
//		System.out.println(wh);
//		for(String w:wh)
//		{
//			driver.switchTo().window(w);
//		}
		String Email=fLib.getFileProperty("email");
	//	wLib.waitUntilPageLoad(driver);
		Thread.sleep(50000);
		lp.Email(Email);
		
	}
	

}
