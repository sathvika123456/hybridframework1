package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositories.Locators;
import com.utilities.commonfunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class JRI_createnewaccount extends commonfunctions{
	WebDriver driver;

	Locators loc = new Locators();

	@BeforeClass
	public void beforeClass() {
		 chromeBrowserLaunch();
	}

	@Test
	public void f() throws Exception {
		// Create New Account
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// To read data from Property file
		String path = "";
		FileInputStream fi = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fi);

		sendKeysByAnyLocator(loc.jre_SignUp_Name, p.getProperty("Name"));

		driver.findElement(loc.jre_SignUp_Name).sendKeys(p.getProperty("Name"));
		driver.findElement(loc.jre_SignUp_MobileNo).sendKeys(p.getProperty("Mobile"));
		driver.findElement(loc.jre_SignUp_Email).sendKeys(p.getProperty("Email"));
		driver.findElement(loc.jre_SignUp_Password).sendKeys(p.getProperty("Password"));

		driver.findElement(loc.jre_SignUp_ReadCheckbox).click();
		 //driver.findElement(loc.jre_SignUp_CreateAccount_Button).click();
		clickByAnyLocator(loc.jre_SignUp_CreateAccount_Button);
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		Date d = new Date();
		DateFormat abcd = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = abcd.format(d);

		//System will get the current screen as screenshot and store it into temp to RAM location
		File abc =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//From RAM location want to move it to specific folder, will use Selenium method FileHandler
		FileHandler.copy(abc,new File(".\\screenshots"+timeStamp+".png"));
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
 
 