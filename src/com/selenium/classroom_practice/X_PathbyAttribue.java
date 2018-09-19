package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class X_PathbyAttribue {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9437617921");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kavya140%");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
