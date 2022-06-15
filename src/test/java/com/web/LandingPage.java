package com.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {

	AndroidDriver driver;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry") 
	private WebElement tapOnDropdown;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='India']")
	private WebElement tapOnIndia;

	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement enterName;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement tapOnM;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement tapOnFm;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement tapOnLetshop;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text='ADD TO CART'])[1]")
	private WebElement selectProd;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement addCart;

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getselectProd() {
		return selectProd;
	}

	public WebElement getTapOnM() {
		return tapOnM;
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getTapOnDropdown() {
		return tapOnDropdown;
	}

	public WebElement getTapOnIndia() {
		return tapOnIndia;
	}

	public WebElement getEnterName() {
		return enterName;
	}

	public WebElement getTapOnFm() {
		return tapOnFm;
	}

	public WebElement getTapOnLetshop() {
		return tapOnLetshop;
	}
	
	public LandingPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//		AppiumFieldDecorator initialize all the elements
	}
	public void loginToApp() {
//		getTapOnDropdown().click();
//		scrollToElement(driver,"text","India");
		getEnterName().sendKeys("Rama");
		getTapOnFm().click();
		getTapOnLetshop().click();
			}
	public void loginToApp(String name) {
//		tapOnDropdown.click();
		enterName.sendKeys(name);
		tapOnFm.click();
		tapOnLetshop.click();
	}
	public static void scrollToElement(AndroidDriver driver, String an, String av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}
	
}
