package com.selenium.classroom_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windwo_Handel {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);

	}

}
