package com.webdDiverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Notification {
	AndroidDriver driver;
	@Test
	
	public void notification() throws MalformedURLException, InterruptedException {
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("App").click();
		driver.findElementByAccessibilityId("Notification").click();
		driver.findElementByAccessibilityId("IncomingMessage").click();
		driver.findElementByAccessibilityId("Show App Notification").click();
		Thread.sleep(2000);
		
		driver.openNotifications();
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		}
}
