package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AddNum {

	@Test
	public void launchcal() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("serialNumber", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage", "com.android.bbkcalculator");
		dc.setCapability("appActivity", ".Calculator");
		
		URL url=new URL("http://localhost:4723/wd/hub");		
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.android.bbkcalculator:id/digit7").click();
		driver.findElementById("com.android.bbkcalculator:id/plus").click();
		driver.findElementById("com.android.bbkcalculator:id/digit3").click();
		driver.findElementById("com.android.bbkcalculator:id/plus").click();
		driver.findElementById("com.android.bbkcalculator:id/digit5").click();
		driver.findElementById("com.android.bbkcalculator:id/equal").click();
		
		int expectedVal=15;		
		
		String result=driver.findElementById("com.android.bbkcalculator:id/input_edit").getText();		
		
		int actual = Integer.parseInt(result);
		Assert.assertEquals(actual, expectedVal);

		System.out.println(actual);
	}
	
}
