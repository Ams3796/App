package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
public class HideKeyBoard {
	@Test
	public void Planets() throws MalformedURLException {
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("2. Dark Theme").click();		
		driver.hideKeyboard();
		driver.findElementById("android:id/text1").click();
	 List<WebElement> allplanets = driver.findElementsById("android:id/text1");	 
//	 for(int i=0;i<=allplanets.size()-1;i++) {
		 //	 }		
		for(WebElement Planet:allplanets) {
			System.out.println(Planet.getText());			
			if(Planet.getText().contains("Earth")) {
				Planet.click();
				break;
			}
				}		
	}
}
