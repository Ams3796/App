package com.webdDiverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Logs {
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		
		dc.setCapability("appPackage","com.android.camera");
		dc.setCapability("appActivity", ".CameraActivity");
		dc.setCapability("noReset", true);

		URL url=new URL("http://localhost:4723/wd/hub");

		driver=new AndroidDriver(url,dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		service.stop();
	}
}
