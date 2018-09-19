package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tag_Locater {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\loginpage.html");
		driver.findElement(By.tagName("text")).sendKeys("subha");
		driver.findElement(By.tagName("text")).sendKeys("subha1");
		driver.findElement(By.tagName("button")).click();

	}

}
