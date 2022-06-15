package com.nykaa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Nykaa {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");	
		dc.setCapability("platformVersion", "8.1.0" );
		//		dc.setCapability("noReset","True");
		dc.setCapability("appPackage", "com.fsn.nykaa");
		dc.setCapability("appActivity", ".authentication.activities.WelcomeLoginAcitivity");

		URL url=new URL("http://localhost:4723/wd/hub");
		driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
}
