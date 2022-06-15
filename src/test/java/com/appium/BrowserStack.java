package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class BrowserStack {

		  public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    
	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "ramadevi_2CPx3U");
	      caps.setCapability("browserstack.key", "s5yEWz7T9p276m7ApEqN");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://<app-id>");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Xiaomi Redmi Note 7");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver driver = new AndroidDriver(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        
	      /* Write your Custom code here */
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElementByAccessibilityId("Views").click();
			driver.findElementByAccessibilityId("Drag and Drop").click();
			
			WebElement src = driver.findElementById("io.appium.android.apis:id/drag_dot_1");

			WebElement dest = driver.findElementById("io.appium.android.apis:id/drag_dot_3");

			TouchAction to=new TouchAction(driver);
			to.longPress(src).waitAction(2000).moveTo(dest).release().perform();
	  
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	    
	    }
}
