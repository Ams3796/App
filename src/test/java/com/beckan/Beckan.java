 package com.beckan;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Beckan {
	static AndroidDriver<AndroidElement> driver;
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1820");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomation2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
//	dc.setCapability(MobileCapabilityType.UDID, "IFMRAE4HIJHYR4G6");
//	dc.setCapability(MobileCapabilityType.NO_RESET, true);
	dc.setCapability("browserName", "Chrome");


URL url=new URL("http://Localhost:4723/wd/hub");

driver=new AndroidDriver<AndroidElement>(url,dc);

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://qa.box.beckn.org/");
	driver.findElement(By.xpath("//input[@placeholder=\"Enter Location\"]")).click();
}
}
