package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class StatusOfCheckBox {

	@Test
	public void checkTheStatus() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");  
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("2. Dark Theme").click();
		boolean rescb1 = driver.findElementByAccessibilityId("Checkbox 1").isSelected();
		System.out.println(rescb1);
		boolean rescb2 = driver.findElementByAccessibilityId("Checkbox 2").isSelected();
		System.out.println(rescb2);
		boolean resrb1 = driver.findElementByAccessibilityId("RadioButton 1").isEnabled();
		System.out.println(resrb1);
		boolean resrb2 = driver.findElementByAccessibilityId("RadioButton 2").isEnabled();
		System.out.println(resrb2);
		
}
}