package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class UninstallApp {


	AndroidDriver driver;
	
	@Test
	public void scrollToElement() throws MalformedURLException {
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
		driver.removeApp("io.appium.android.apis");
		System.out.println("App status="+ driver.isAppInstalled("io.appium.android.apis"));
		
		
		
}
	
}
