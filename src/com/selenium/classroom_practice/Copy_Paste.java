package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copy_Paste {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("subha");
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.CONTROL,"c");
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys(Keys.CONTROL,"v");
		System.out.println(password.getAttribute("value"));

	}

}
