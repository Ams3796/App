package com.beckan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BecknApp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://qa.box.beckn.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}
}
