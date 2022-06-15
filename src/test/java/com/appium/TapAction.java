package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TapAction {
	@Test
	public void addingNoUsingTapMethod() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage", "com.android.bbkcalculator");
		dc.setCapability("appActivity", ".Calculator");

		URL url=new URL("http://localhost:4723/wd/hub");		
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement seven=driver.findElementById("com.android.bbkcalculator:id/digit7");
		tapmethod(driver, seven);
		WebElement plus=driver.findElementById("com.android.bbkcalculator:id/plus");
		tapmethod(driver, plus);
		WebElement three=driver.findElementById("com.android.bbkcalculator:id/digit3");
		tapmethod(driver,three);
		WebElement plus1=driver.findElementById("com.android.bbkcalculator:id/plus");
		tapmethod(driver, plus1);
		WebElement five=driver.findElementById("com.android.bbkcalculator:id/digit5");
		tapmethod(driver, five);
		WebElement equal=driver.findElementById("com.android.bbkcalculator:id/equal");
		tapmethod(driver, equal);
		String result=driver.findElementById("com.android.bbkcalculator:id/input_edit").getText();

		int expectedVal=15;

		int actual = Integer.parseInt(result);
		Assert.assertEquals(actual, expectedVal);

		System.out.println(result);
	}

	public void tapmethod(AndroidDriver driver, WebElement element){
		driver.tap(1, element,500);
	}


}
