package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReplaceText {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("\"https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@tabindex='1']"));
		username.sendKeys("subha");
		username.clear();
		username.sendKeys("subha1");

	}

}
