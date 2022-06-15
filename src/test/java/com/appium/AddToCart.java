package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AddToCart {

AndroidDriver driver;
	@Test
	public void networkconnection() throws MalformedURLException, InterruptedException {
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
		scrollToElement(driver,"text","India");
		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Rama");
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
//		expected = driver.findElementById("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]").click();
		driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();		
		
		String actual = driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		String expected=("Air Jordan 4 Retro");
		Assert.assertEquals(expected,actual);
	}		
		public static void scrollToElement(AndroidDriver driver, String an, String av) {
			driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");			
		}
}

