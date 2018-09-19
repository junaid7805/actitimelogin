package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrontStyleColon {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@tabindex='1']"));
		System.out.println(email.getCssValue("font-size"));
		System.out.println(email.getCssValue("font-family"));
		System.out.println(email.getCssValue("color"));

	}

}
