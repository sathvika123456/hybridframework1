package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectrepositories.Locators;

import com.utilities.commonfunctions;

public class toyato  extends commonfunctions {
	
		Locators loc = new Locators();
  @Test
  public void f() throws Exception {
	    chromeBrowserLaunch();
		  Thread.sleep(3000);
		  driver.get("https://www.toyota.co.uk/order-a-brochure");
		  Thread.sleep(3000);
		  loopAllFramesForElement(By.id("onetrust-accept-btn-handler"));
		  clickByAnyLocator(By.id("onetrust-accept-btn-handler"));
		  Thread.sleep(3000);
		   loopAllFramesForElement(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/div/div/button"));
		  clickByAnyLocator(By.xpath("/html/body/div[7]/div[2]/div/div/div[2]/div/div/button"));
		  Thread.sleep(3000);
		  loopAllFramesForElement(By.xpath("/html/body/div[1]/section/div/div[1]/div/form/div[1]/div/ul/li[2]/a/div"));
		  clickByAnyLocator(By.xpath("/html/body/div[1]/section/div/div[1]/div/form/div[1]/div/ul/li[2]/a/div"));
		
	  }
  }


