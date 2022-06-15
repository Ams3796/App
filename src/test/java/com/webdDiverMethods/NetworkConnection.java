package com.webdDiverMethods;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class NetworkConnection {

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
		
		Connection currentstate=driver.getConnection();
		System.out.println(currentstate);
		driver.setConnection(Connection.WIFI);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.DATA);
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.AIRPLANE);
		System.out.println(driver.getConnection());
		
		
		
		
} 
}