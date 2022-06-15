package com.web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class WebApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1820");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		dc.setCapability(MobileCapabilityType.UDID, "IFMRAE4HIJHYR4G6");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		
//		Launch Browser
	dc.setCapability("browserName", "Chrome");
	
//	AppiumServer Port No
	URL url=new URL("http://Localhost:4723/wd/hub");
	
	AndroidDriver driver=new AndroidDriver(url,dc);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	
	
	
	
	
	
	
		
		
	}
}
