package com.selenium.classroom_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Absolute_Xpah {
	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("C:\\Users\\Dell\\Desktop\\Html_pogram\\X_PATH.html");
	driver.findElement(By.xpath("html/body/div[2]/input[1]")).click();

	  }

 }
