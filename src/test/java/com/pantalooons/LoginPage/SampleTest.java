package com.pantalooons.LoginPage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	@Test
		public void createpage()
		{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.pantaloons.com");
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("wzrk-cancel")).click();
		  driver.findElement(By.xpath("//a[@title='My Account']")).click();
		  String text = driver.findElement(By.xpath("//label[text()='Enter Mobile Number*']")).getText();
		  System.out.println(text);
		  String text1 = driver.findElement(By.xpath("//p[text()='Or login with']")).getText();
		  System.out.println(text1);
		  
		  driver.findElement(By.name("phone")).sendKeys(" ");
		  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		  boolean text4 = driver.findElement(By.xpath("//span[@class='undefined app-error-field-log']")).isDisplayed();
		  if(text4==true) 
		  {
			  System.out.println("Please enter mobile number");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();  
		  }
		   
		  
		  driver.findElement(By.name("phone")).sendKeys("987765431");
		  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		
		  boolean text5 = driver.findElement(By.xpath("//span[@class='undefined app-error-field-log']")).isDisplayed();
		  
		  if(text5==true)
		  {
			  System.out.println("Enter 10 digit mobile number");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		  }
		  
		  driver.findElement(By.name("phone")).sendKeys("98776543@1");
		  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		
		  boolean text6 = driver.findElement(By.xpath("//span[@class='undefined app-error-field-log']")).isDisplayed();
		  
		  if(text6==true)
		  {
			  System.out.println("Enter 10 digit mobile number it will not accept special character");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		  }
		  
		  driver.findElement(By.name("phone")).sendKeys("aaaaaaaaaa");
		  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		
		  boolean text7 = driver.findElement(By.xpath("//span[@class='undefined app-error-field-log']")).isDisplayed();
		  
		  if(text7==true)
		  {
			  System.out.println("Enter 10 digit mobile number it will not accept alphabates");
		  }
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		  }
		  
			
		}
	

}
