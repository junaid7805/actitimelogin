package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsContextClick {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement link=driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
		//act.sendKeys("t").perform();
		act.sendKeys("w").perform();
	}

}
