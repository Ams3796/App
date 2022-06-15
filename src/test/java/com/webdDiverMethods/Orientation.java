package com.webdDiverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import io.appium.java_client.android.AndroidDriver;

public class Orientation {

AndroidDriver driver;
	
	@Test
	public void viewOrientatio() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos"); 
		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement view = driver.findElementByAccessibilityId("Views");
		view.click();
		ScreenOrientation currentScreenOrientatio=driver.getOrientation();
		System.out.println(currentScreenOrientatio);
		Thread.sleep(2000);
		driver.rotate(ScreenOrientation.LANDSCAPE);
		System.out.println(driver.getOrientation());
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println(driver.getOrientation());
	}
}
