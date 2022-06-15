package com.web;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ReadDesiredCapFromJson {
	public static AndroidDriver staticdriver;
	public AndroidDriver driver;
	@Test
	public void scen1() throws InterruptedException, IOException, ParseException {
		DesiredCapabilities dc=new DesiredCapabilities();
		ReadDataFromJSon data=new ReadDataFromJSon();
		dc.setCapability(IPathConstants.deviceName,data.readDatafromJSON("deviceName") );
		dc.setCapability(IPathConstants.automationName ,data.readDatafromJSON("automationName") );
		dc.setCapability(IPathConstants.platformName, data.readDatafromJSON("platformName"));
		dc.setCapability(IPathConstants.platformVersion, data.readDatafromJSON("platformVersion"));
		dc.setCapability(IPathConstants.UDID, data.readDatafromJSON("UDID"));
		
		dc.setCapability("app","C:\\Users\\Rama\\Downloads\\General-Store.apk");
		 
		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
		staticdriver=driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		scrollToElement(driver, "text", "India");
		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Rama");
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		String product = driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		String expected="Air Jordan 4 Retro";
		Assert.assertEquals(product, expected);
		System.out.println("actual product is" + product);
		
			}
	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}
	public static String getscreenshot( String name) throws IOException 
	{
		File srcfile =((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile= System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile) ;
		FileUtils.copyFile(srcfile,finaldest);
		return destfile;
		


	}

}
