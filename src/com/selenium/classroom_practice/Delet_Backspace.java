package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Delet_Backspace {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			WebElement email=driver.findElement(By.xpath("//input[@tabindex='1']"));
			email.sendKeys("subha");
			email.sendKeys(Keys.CONTROL,"a");
			Thread.sleep(2000);
			email.sendKeys(Keys.BACK_SPACE);
			//email.sendKeys(Keys.DELETE);

	}
	

}
