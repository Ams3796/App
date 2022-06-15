package chingariApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GS {
	AndroidDriver driver;
	
	@Test
	public void swipe() throws MalformedURLException { 
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");		
		driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
		scrollToElement(driver, "text", "India");
		driver.findElementById("//android.widget.TextView[@text='India'").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("RAMA");
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
				
}
	
	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}
}
