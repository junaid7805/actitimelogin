package com.selenium.classroom_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuchOf_ChromDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM_CHROEM_DRIVER\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}


}
