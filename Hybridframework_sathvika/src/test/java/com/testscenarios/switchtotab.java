package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepositories.Locators;
import com.utilities.commonfunctions;

public class switchtotab extends commonfunctions {
	Locators loc = new Locators();
  @Test
  public void f() throws Exception {
	  chromeBrowserLaunch();
      driver.get("https://demoqa.com/browser-windows");
      //wait statement
      Thread.sleep(5000);
      driver.findElement(By.id("tabButton")).click();
      Thread.sleep(5000);
      switchAndCloseNewTab();
      driver.findElement(By.id("windowButton")).click();
      Thread.sleep(5000);
      popupHandleToCloseTheChildWindow();
      driver.quit();
      
      
	  
	  
  }
}
