package com.webdDiverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Android_KeyActions {
	
public static void main(String[] args) throws MalformedURLException, Throwable {
	
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("noReset", true);
		dc.setCapability("appPackage","com.android.camera");
		dc.setCapability("appActivity", ".CameraActivity");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		Thread.sleep(2000);		
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		Thread.sleep(2000);
		
		
		
	}
}

