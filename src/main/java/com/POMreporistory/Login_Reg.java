package com.POMreporistory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibaray.WebDriverUtility;

public class Login_Reg  extends WebDriverUtility{
	
	WebDriver driver;
	public Login_Reg(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	}

	@FindBy(id="wzrk-confirm")
	private WebElement popup;
	
	public WebElement getPopup() {
		return popup;
	}
	
	public void myAccount()
	{	
	 popup.click();
	}

	@FindBy(xpath="//a[@title='My Account']")
	private WebElement Myaccount;

	public WebElement getMyaccount() {
		return Myaccount;
	}
	
	@FindBy(xpath="//div[@class='pan-social-item social-google']")
	private WebElement btn_login;

	public WebElement getBtn_login() {
		return btn_login;
	}
	 public void login()
	 {
		 btn_login.click();
	 }
	
	
	
	@FindBy(xpath="//label[text()='Enter Mobile Number*']")
	private WebElement reglogin;
	
	public WebElement getReglogin() {
		return reglogin;
	}
	
	@FindBy(xpath="//p[text()='Or login with']")
	private WebElement googlelogin;
	
	public WebElement getGooglelogin() {
		return googlelogin;
	}
	
	@FindBy(name="phone")
	private WebElement btn_mob;
	
	public WebElement getBtn_mob() {
		return btn_mob;
	}
	@FindBy(xpath="//span[@class='MuiButton-label']")
	private WebElement btn_get_otp;
	
	@FindBy(xpath="//span[@class='undefined app-error-field-log']")
	private WebElement dispaly_text;
	
	
	public WebElement getBtn_get_otp() {
		return btn_get_otp;
	}
	
	public WebElement getDispaly_text() {
		return dispaly_text;
	}
	
	public void Mob(String mob1) {
		btn_mob.sendKeys(mob1);
		btn_get_otp.click();
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement btn_email;
	
	public WebElement getBtn_email()
	{
		return btn_email;
	}
	

	public void Email(String email) {
		btn_email.sendKeys(email);
		
	}

}
