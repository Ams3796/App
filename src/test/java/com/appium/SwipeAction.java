package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeAction {

	AndroidDriver driver;
	@Test
	public void swipe() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");

		URL url=new URL("http://localhost:4723/wd/hub");		
		driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension size=driver.manage().window().getSize();
		int ht=size.getHeight();
		int wd=size.getWidth();
		System.out.println("Height of Phone is"+ ht );
		System.out.println("Width of Phone is"+ wd );
		
//		driver.swipe((int)(wd*0.1),(int)(ht*0.8), (int)(wd*0.9),(int)(ht*0.8),500);
//		driver.swipe((int)(wd*0.1),(int)(ht*0.2), (int)(wd*0.9),(int)(ht*0.2),500);
//		driver.swipe((int)(wd*0.1),(int)(ht*0.5), (int)(wd*0.9),(int)(ht*0.5),500);
		
//		driver.swipe((int)(wd*0.1),(int)(ht*0.2), (int)(wd*0.1),(int)(ht*0.8),500);
//		driver.swipe((int)(wd*0.5),(int)(ht*0.2), (int)(wd*0.5),(int)(ht*0.8),500);
//		driver.swipe((int)(wd*0.9),(int)(ht*0.2), (int)(wd*0.9),(int)(ht*0.8),500);
		
		
		driver.swipe((int)(wd*0.1),(int)(ht*0.2), (int)(wd*0.9),(int)(ht*0.2),500);

//		public void swipeLeftToRight(int x,int y) {
//			driver.swipe(start x, start y, end x, end y)
//		}

	}
}
