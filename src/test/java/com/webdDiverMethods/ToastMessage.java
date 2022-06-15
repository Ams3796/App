package com.webdDiverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ToastMessage {

	AndroidDriver driver;
	@Test
	public void networkconnectioToastmsg() throws MalformedURLException, InterruptedException {
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
//		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
//		scrollToElement(driver,"text","India");
//		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		String toastmsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastmsg);
		
		
	}
		
		public static void scrollToElement(AndroidDriver driver, String an, String av) {
			driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
			
		}
		
	
}
