package com.pantalooons.LoginPage;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.GenericLibaray.BaseAnnotationClass;
import com.POMreporistory.MyAcc_Pom;

public class MyAccountTest extends BaseAnnotationClass {
	@Test
	public void MyAccTest() throws IOException, InterruptedException
	{
	  MyAcc_Pom MP=new MyAcc_Pom(driver);
	  MP.Pop();
	  MP.getMyaccount().click();
	  wLib.waitUntilPageLoad(driver);
	  String Mob1 = fLib.getFileProperty("mob");
	  MP.Mob(Mob1);
	  
	  MP.ClickGender();
	  MP.getBtn_Ms().click();
	  MP.getBtn_Mrs().click();
	   
	  boolean text = MP.getTxt_ph().isEnabled();
	  if(text==true)
	  {
		  System.out.println("Mobile field is  not greyed out");
	  }
	  else
	  {
		  System.out.println("Mobile field is greyed out");  
	  }
	  
	  String length = MP.getTxt_otp().getAttribute("maxlength");
	  int length1=Integer.parseInt(length);
	  System.out.println(length);
	  String Len = fLib.getFileProperty("len");
	  int len1=Integer.parseInt(Len);
	  if(length1==len1)
	  {
		  System.out.println("otp is valid");
	  }
	  else if(7>len1 && 5<len1)
	  {
		  System.out.println("otp should be 6 digit");
	  }
	  else
	  {
		  System.out.println("Please enter only digit");
	  }
	  
	  String firstname = fLib.getFileProperty("firstName");
	  String lastname = fLib.getFileProperty("lastName");
	  String email = fLib.getFileProperty("email"); 
	  
	  
	  Thread.sleep(10000);
	  MP.Regfill(firstname,lastname,email);
	  wLib.scrollToWebElement(driver, MP.getBtn_radio());
	  MP.getBtn_radio().click();
	  Thread.sleep(20000);
	  try
	  {
	    MP.getBtn_shop().click();
	  }
	  catch(Exception e){
	  String actualerremailtext="Email already exists, please enter a different email.";
	  
	  WebElement Ele=MP.getErr_email();
	  
	  String actualtext="You seem to have entered an incorrect OTP. Please try again";
	  WebElement ele = MP.getTxt_inotp();
	  SoftAssert soft=new SoftAssert(); 
	  if(Ele.isDisplayed()==true)
	  {
		 
		    String expectedtext= MP.getErr_email().getText();
	    	soft.assertEquals(actualerremailtext, expectedtext);
		    Reporter.log("emailid is already exist enter other email id",true); 
	  }
	  else if(ele.isDisplayed()==true)
	  {
	    String expectedtext= MP.getTxt_inotp().getText();
    	soft.assertEquals(actualtext, expectedtext);
	    Reporter.log("enter valid otp",true);
	  }
//	  else
//	  {
//		  MP.getBtn_shop().click();
//	  }
	  }
	  
	  
	}
	@Test
	public void VerifyRegPage() throws IOException, InterruptedException
	{
		 MyAcc_Pom MP=new MyAcc_Pom(driver);
		  MP.Pop();
		  MP.getMyaccount().click();
		  wLib.waitUntilPageLoad(driver);
		  String Mob1 = fLib.getFileProperty("mob");
		  MP.Mob(Mob1);
		  
		  MP.ClickGender();
		  String firstname = fLib.getFileProperty("firstName");
		  String lastname = fLib.getFileProperty("lastName");
		  String email = fLib.getFileProperty("email"); 
		  Thread.sleep(10000);
		  MP.Regfill(firstname,lastname,email);
		
	}

}
