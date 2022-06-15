package com.amazon.seller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AmazonSeller {
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Adoid");	
		dc.setCapability("platformVersion", "8.1.0" );
		//		dc.setCapability("noReset","True");
		dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		dc.setCapability("appActivity", "com.amazon.windowshop.home.HomeLauncherActivity");

		URL url=new URL("http://localhost:4723/wd/hub");
		driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		scrollToElement(driver, "text", "India");
//		driver.swipe(62, 164, 94, 1343, 10);
//		driver.swipe(94, 1343, 154,862,10);
//		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();

		driver.findElementByAccessibilityId("Select English").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/continue_button").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		
	
		
		WebElement options = driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text");
		options.sendKeys("Home Theater");
		Thread.sleep(2000);
//		driver.findElementByAccessibilityId("scan it").click();
//		List<WebElement list = driver.findElementsById("in.amazon.mShop.android.shopping:id/rs_search_src_text");
//		System.out.println(list.size());
//		for(WebElement ele:list) {
//			System.out.println(ele.getText());
//		}
		

	}
	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		driver.findElementByAndroidUIAutomator("new UIScrollable(new UiSelector().ScrollIntoView("+an+"(\""+av+"\")))");
	}
}
