package generalStores;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;

public class GeneralStores {


public static void main(String[] args) throws MalformedURLException, InterruptedException  {
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "8.1.0");
	dc.setCapability("automationName", "Appium");
	dc.setCapability("deviceName", "vivo 1820");
	dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver	driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	 driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
	 
	scrollToElement(driver,"text", "Austria");
	driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Rama");
	driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
	driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

	driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
	String tm=driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
	System.out.println(tm);
}

public static void scrollToElement(AndroidDriver driver, String an, String av) {
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
	
}
}
	


