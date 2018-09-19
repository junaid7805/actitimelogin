package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Name_Locater {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.className("textField")).sendKeys("dodo");
		driver.findElement(By.className("textField pwdfield")).sendKeys("subha");

	}

}
