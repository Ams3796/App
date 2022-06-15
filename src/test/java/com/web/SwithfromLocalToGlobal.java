package com.web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwithfromLocalToGlobal {

	AndroidDriver driver;
	@Test
	public void scen1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("app","C:\\Users\\Rama\\Downloads\\General-Store.apk");
		 
		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LandingPage lp = new LandingPage(driver);
		lp.loginToApp();
		lp.getAddCart();
		
		Set<String> windows = driver.getContextHandles();
		for(String window: windows) {
			System.out.println("Active App:" + window);
					}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Rose");
}
}
