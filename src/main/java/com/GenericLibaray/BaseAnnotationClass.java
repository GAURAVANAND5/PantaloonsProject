package com.GenericLibaray;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.POMreporistory.Login_Reg;

import io.github.bonigarcia.wdm.WebDriverManager;





public class BaseAnnotationClass {
	
	 /*create Objects */
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	 public ChromeOptions option=new ChromeOptions();
	


	@BeforeClass
	public void ConfigBC() throws Throwable
	{
		System.out.println("=========================Launch the Browser====================");
		/*reading common data*/
		String BROWSER = fLib.getFileProperty("browser");
		
		/*launching the Browser */
		//ChromeOptions option=new ChromeOptions();
         WebDriverManager.chromedriver().setup();
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver(option);
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver(option);
		}
		else
		{
			System.out.println("invalid Browser");
		}
		wLib.windowMaximize(driver);
		wLib.waitUntilPageLoad(driver);
		option.addArguments("--disable-notifications");
		sdriver=driver;
	
	}
	@BeforeMethod
	public void ConfigBM() throws Throwable
	{
		
		/*reading common data*/
		System.out.println("================= Login to app==========");
		String URL = fLib.getFileProperty("url");
		driver.get(URL);
		option.addArguments("--disable-notifications");
		
	}


	@AfterMethod
	public void ConfigAM() throws Throwable
	{
		System.out.println("========================Logout to App=======================");
		
		}
	@AfterClass
	public void ConfigAC() throws InterruptedException
	{
		System.out.println("========================Close the Browser=======================");
		/*  close the Browser */
		Thread.sleep(50000);
		driver.close();
	}
	


}
