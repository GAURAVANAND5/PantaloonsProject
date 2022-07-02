package com.POMreporistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibaray.WebDriverUtility;

public class MyAcc_Pom  extends WebDriverUtility{
	
	
	WebDriver driver;
	public MyAcc_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="wzrk-cancel")
	private WebElement popupa;

	public WebElement getPopupa() {
		return popupa;
	}
	 public void Pop()
	 {
		 popupa.click();
	 }
	 @FindBy(xpath="//a[@title='My Account']")
		private WebElement Myaccount;

		public WebElement getMyaccount() {
			return Myaccount;
		}
		@FindBy(name="phone")
		private WebElement btn_mob;
		
		public WebElement getBtn_mob() {
			return btn_mob;
		}
			
			@FindBy(xpath="//span[@class='MuiButton-label']")
			private WebElement btn_get_otp;
			
			public WebElement getBtn_get_otp() {
				return btn_get_otp;
			}
			
		
			public void Mob(String mob1) {
				btn_mob.sendKeys(mob1);
				btn_get_otp.click();
				
			}
		
			@FindBy(xpath="(//input[@name='gender'])[1]")
			private WebElement btn_Mr;
			
			public WebElement getBtn_Mr() {
				return btn_Mr;
			}
			
			public void ClickGender() {
				boolean text = btn_Mr.isEnabled();
				boolean flag=true;
				if(text==flag)
				{
					System.out.println("Radio button is enable");
					btn_Mr.click();
				}
				else
				{
					System.out.println("Radio button is not enable");
				}
			}
				
				@FindBy(xpath="(//input[@name='gender'])[2]")
				private WebElement btn_Ms;
					
		      public WebElement getBtn_Ms()
		      {
		    	  return btn_Ms;
		    	  
		      }
		      @FindBy(xpath="(//input[@name='gender'])[3]")
				private WebElement btn_Mrs;
					
		      public WebElement getBtn_Mrs()
		      {
		    	  return btn_Mrs;
		      }
		      
		      @FindBy(xpath="//input[@name='phone']")
		      private WebElement txt_ph;
		      
		    
			public WebElement getTxt_ph() {
				 return txt_ph;
	
			}
			
			@FindBy(name="otp")
			private WebElement txt_otp;
			
			public WebElement getTxt_otp()
			{
				return txt_otp;
			}
			
			@FindBy(xpath="//span[text()='You seem to have entered an incorrect OTP. Please try again']")
			private WebElement txt_inotp;
			
			
			public WebElement getTxt_inotp() {
				return txt_inotp;
			}
			
			@FindBy(xpath="//input[@name='firstName']")
			private WebElement txt_firstname;
			
			@FindBy(xpath="//input[@name='lastName']")
			private WebElement txt_lastname;
			
			public WebElement getTxt_firstname() {
				return txt_firstname;
			}
			
			public WebElement getTxt_lastname() {
				return txt_lastname;
			}
			
			@FindBy(xpath="//input[@name='email']")
			private WebElement txt_email;
			
			public WebElement getTxt_email()
			{
				return txt_email;
			}
			
			@FindBy(xpath="//span[@class='error-text-email']")
			private WebElement err_email;
			
			public WebElement getErr_email()
			{
				return err_email;
			}
			
			@FindBy(xpath="//*[name()='svg' and @class='MuiSvgIcon-root customform_not-checked__27fuJ']")
			private WebElement btn_radio;
			
			public WebElement getBtn_radio()
			{
				return btn_radio;
			}
			
			public void Regfill(String firstname,String lastname ,String email) throws InterruptedException
			{
				
			    Thread.sleep(10000);
				txt_firstname.sendKeys(firstname);
				String expectedname=txt_firstname.getText();
				System.out.println(expectedname);
				if(expectedname.matches("["+firstname+"]+"))
				{
					System.out.println("Name is valid");
				}
				else
				{
					System.out.println("Enter only alphabates  with vaild name");
				}
				
				Thread.sleep(10000);
				txt_lastname.sendKeys(lastname);
				String expectedlastname=txt_firstname.getText();
				System.out.println(expectedlastname);
				if(expectedlastname.matches("["+lastname+"]+"))
				{
					System.out.println("lastName is valid");
				}
				else
				{
					System.out.println("Enter only alphabates  with vaild lastname");
				}
				
				Thread.sleep(10000);
				txt_email.sendKeys(email);
				
				
			}
			
			@FindBy(xpath="//span[@class='MuiButton-label']")
			private WebElement btn_shop;
			
			public WebElement getBtn_shop() {
				return btn_shop;
			}
			
			
//			@FindBy(xpath="//span[text()='Please Enter Name']")
//			private WebElement txt_firstfield;
//			
//			public WebElement getTxt_firstfield() {
//				return txt_firstfield;
//			}
		
			
			
			

			
}
