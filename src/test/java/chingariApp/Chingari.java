package chingariApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Chingari {

	static AndroidDriver driver;
//	@Test
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//	public void scen2() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1820");
		dc.setCapability("automationName", "UIAutomator2");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "IFMRAE4HIJHYR4G6");
		dc.setCapability("appPackage","io.chingari.app");
		dc.setCapability("appActivity",".Activity.ViewPagerActivity");

		
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElementByXPath("(//android.widget.TextView[@text='English'])[1]").click();
		driver.findElementByXPath("(//android.widget.ImageView[@resource-id='io.chingari.app:id/icon'])[5]").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Language']").click();
		driver.findElementByXPath("(//android.widget.TextView[@text='English'])[1]").click();
		driver.findElementById("io.chingari.app:id/homeVideoUserIcon").click();
		driver.findElementById("io.chingari.app:id/btnFollowHint").click();
		
//		driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='io.chingari.app:id/phone_login']").click();
//		driver.findElementById("io.chingari.app:id/editText").sendKeys("8019229583");
//		driver.findElementById("io.chingari.app:id/mobile_login").click();
//		driver.findElementById("io.chingari.app:id/otpverify").click(); //Mobile
	
		driver.findElementById("io.chingari.app:id/google_login").click();// through mail id
		Thread.sleep(2000);
		driver.findElementByXPath("(//android.widget.ImageView[@resource-id='com.google.android.gms:id/og_apd_internal_image_view'])[2]").click();
		

//		String toastmsg=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("your name here");
//		toastmsg.isBlank();
		
//		driver.findElementById("com.google.android.gms:id/add_account_chip_title").click(); // through new mail id
	
	}
	
}
