package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Copy_Paste_Without_ShrotCut {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@tabindex='1']"));
		email.sendKeys("subha");
		String value=email.getAttribute("value");
		driver.findElement(By.id("pass")).sendKeys(value);
				

	}

}
