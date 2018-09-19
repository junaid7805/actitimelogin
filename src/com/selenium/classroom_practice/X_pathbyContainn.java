package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class X_pathbyContainn {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\X_PATH1.html");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'in')]")).click();

		}

}
