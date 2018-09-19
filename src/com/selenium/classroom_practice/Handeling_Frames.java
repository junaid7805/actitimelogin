package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handeling_Frames {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/Html_pogram/Frame1.html");
		WebElement element=driver.findElement(By.id("t1"));
         element.sendKeys("subha");
         driver.switchTo().frame("f1");
         driver.findElement(By.id("t2")).sendKeys("poonam");
        // driver.switchTo().defaultContent();
        // element.clear();
         driver.switchTo().parentFrame();
         driver.switchTo().frame(1);
         driver.findElement(By.id("t2")).sendKeys("chiru");
	}

}
