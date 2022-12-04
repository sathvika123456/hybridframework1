package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.commonfunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.testng.annotations.AfterClass;

public class fb_login extends commonfunctions {
	WebDriver driver;
	 @BeforeClass
	  public void beforeClass()  {
		  WebDriver  driver =  new ChromeDriver();
	  }
  @Test
  public void f() throws Exception {
	  driver.get("https://www.facebook.com/");
      //wait statement
      Thread.sleep(5000);
	  driver.findElement(By.id("email")).sendKeys("sathvikakakkerla6@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("sathvika5599");
      //click on login
      driver.findElement(By.name("login")).click();
      
  }
  @AfterMethod
  public void afterMethod() throws Exception {
	screenshot();
	
}


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }


}
