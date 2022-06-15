package com.web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelExecution {
	@Parameters({"deviceName","PLATFORM_NAME", "UDID", "port"})
	@Test
	public void parallelExecution(String deviceName,String PLATFORM_NAME, String UDID, String port) throws MalformedURLException {
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
}
}