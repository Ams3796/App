package com.justDail;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class JustDail {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName", "vivo 1820");
	dc.setCapability("automationName", "Appium");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "8.1.0");
	dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
	dc.setCapability("appPackage","com.justdial.search");
	dc.setCapability("appActivity","SplashScreenNewActivity");
	
	
	URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	driver.findElementById("com.justdial.search:id/terms_accept_btn").click();
//	driver.findElementById("com.justdial.search:id/registration_name").sendKeys("Rama");
//	driver.findElementById("com.justdial.search:id/registration_phone_number_value").sendKeys("8019229583");
//	driver.findElementById("com.justdial.search:id/button_login").click();
	
	driver.findElementById("com.justdial.search:id/continuesas").click();
	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	driver.findElementByXPath("//android.widget.TextView[@text='Travel']").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//android.widget.TextView[@text='Flights']").click();
	
	driver.findElementById("com.justdial.search:id/from_city").click();
	driver.hideKeyboard();
	driver.findElementByXPath("//android.widget.TextView[@text='Bangalore, IN - Kempegowda International Airport']").click();
	driver.findElementById("com.justdial.search:id/to_city").click();
	driver.hideKeyboard();
	driver.findElementByXPath("//android.widget.TextView[@text='Goa, IN - Dabolim Airport']").click();
	Thread.sleep(2000);
	driver.findElementById("com.justdial.search:id/search_flights").click();
//	driver.findElementById("justdial.search:id/divider_shadow_time").click();
		driver.findElementByXPath("//android.view.View[@bounds='[0,736][720,874]']").click();
		Thread.sleep(3000);
		driver.swipe(246, 79, 586, 1105, 05);
		driver.swipe(586, 1105, 65, 1132, 10);
		Thread.sleep(2000);
//		driver.findElementByXPath("//android.widget.RelativeLayout[@bounds='[0,749][720,879]']").click();
		
//		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]").click();
		driver.findElementByXPath("//android.widget.TextView[@resource-id='com.justdial.search:id/travler_count']");
		
//		driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.justdial.search:id/jdcashlogo']").click();
		
		driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();
		
//driver.findElementByXPath("//android.widget.RelativeLayout[@bounds='[0,598][720,728]']").click(); //yes
	}
}