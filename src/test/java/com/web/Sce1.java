package com.web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Sce1 {
	
	@Test
	@Parameters({"deviceName","platformVersion","UDID","port"})
	public void scen1(String deviceName, String platformVersion, String UDID, String port ) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", deviceName);
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion",platformVersion);
		dc.setCapability("UDID", UDID);
		dc.setCapability("app","C:\\Users\\Rama\\Downloads\\General-Store.apk");
		 
		
		URL url=new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
