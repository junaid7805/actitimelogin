package com.selenium.classroom_practice;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_BTW_Two_Windows {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);
		
		ArrayList<String> al=new ArrayList<>(windows);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//a[.='Try Free']")).click();
		driver.switchTo().window(al.get(0));
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

	
	}

}
