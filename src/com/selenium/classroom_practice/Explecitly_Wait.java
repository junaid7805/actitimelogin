package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explecitly_Wait {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		WebDriverWait Wait=new WebDriverWait(driver,1);
		//Wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		//Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='logout']")));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();

	}

}
