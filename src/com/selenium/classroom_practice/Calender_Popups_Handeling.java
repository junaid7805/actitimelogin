package com.selenium.classroom_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_Popups_Handeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("21/09/2018")).click();

	}

}
