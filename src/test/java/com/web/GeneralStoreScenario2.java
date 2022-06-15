package com.web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreScenario2 {
	AndroidDriver driver;
	@Test
	public void scen2() throws MalformedURLException, InterruptedException {
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
		
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		scrollToElement(driver, "text", "India");
		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Rama");
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
		driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		String product1= driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		System.out.println(product1);
		int pro1 = Integer.parseInt(product1);
		
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();		
		String product2= driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		System.out.println(product2);
		int pro2 = Integer.parseInt(product2);
		double expected=280.97;
		int actual=pro1+pro2;
		Assert.assertEquals(actual, expected);
		System.out.println("Actual value is " + actual);
		
		
}
	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}
}